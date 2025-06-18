import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hm = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (hm.containsKey(num)) {
				int value = hm.get(num);
				hm.put(num, ++value);
			} else {
				hm.put(num, 1);
			}
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (hm.containsKey(num))
				bw.write(hm.get(num) + " ");
			else
				bw.write(0 + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
