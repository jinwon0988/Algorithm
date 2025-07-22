import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<>();
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			if (st.nextToken().equals("enter")) {
				hs.add(name);
			} else {
				hs.remove(name);
			}
		}
		ArrayList<String> al = new ArrayList<>(hs);
		Collections.sort(al, Collections.reverseOrder());
		for (String s : al) {
			bw.write(s + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}