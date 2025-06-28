import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			hs.add(input);
		}
		ArrayList<String> A = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			if (hs.contains(input)) {
				A.add(input);
			}
		}
		Collections.sort(A);
		bw.write(A.size() + "\n");
		for (String s : A) {
			bw.write(s + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}