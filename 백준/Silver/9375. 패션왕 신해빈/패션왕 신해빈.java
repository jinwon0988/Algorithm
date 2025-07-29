import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<String, Integer> hm = new HashMap<>();
			StringTokenizer st;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String v = st.nextToken();
				String k = st.nextToken();
				hm.put(k, hm.getOrDefault(k, 0) + 1);
			}
			int result = 1;
			for (int i : hm.values()) {
				result *= (i + 1);
			}
			bw.write((result - 1) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}