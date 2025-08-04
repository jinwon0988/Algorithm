import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		HashMap<Integer, Integer> hm = new HashMap<>();
		int result = -1;
		for (int i = 0; i < N; i++) {
			int id = Integer.parseInt(br.readLine());
			if (!hm.containsKey(id)) {
				hm.put(id, i);
			} else {
				if (i - hm.get(id) <= K)
					result = Math.max(result, id);
				hm.put(id, i);
			}
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}