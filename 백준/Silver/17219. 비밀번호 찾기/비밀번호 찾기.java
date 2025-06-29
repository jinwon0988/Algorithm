import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String, String> hm = new HashMap<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String site = st.nextToken();
			String pass = st.nextToken();
			hm.put(site, pass);
		}
		for (int i = 0; i < M; i++) {
			String site = br.readLine();
			bw.write(hm.get(site) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}