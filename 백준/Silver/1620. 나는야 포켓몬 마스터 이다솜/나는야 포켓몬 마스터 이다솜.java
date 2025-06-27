import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<Integer, String> hm1 = new HashMap<>();
		HashMap<String, Integer> hm2 = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			String input = br.readLine();
			hm1.put(i, input);
			hm2.put(input, i);
		}
		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			if (input.charAt(0) >= '0' && input.charAt(0) <= '9') {
				bw.write(hm1.get(Integer.parseInt(input)) + "\n");
			} else {
				bw.write(hm2.get(input) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}