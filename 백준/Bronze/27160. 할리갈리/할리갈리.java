import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String fruit = st.nextToken();
			int count = Integer.parseInt(st.nextToken());
			if (hm.containsKey(fruit)) {
				count += hm.get(fruit);
			}
			hm.put(fruit, count);
		}
		String result = hm.containsValue(5) ? "YES" : "NO";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}