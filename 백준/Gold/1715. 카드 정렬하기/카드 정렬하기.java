import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			pq.offer(Integer.parseInt(br.readLine()));
		}
		int sum = 0;
		while (pq.size() != 1) {
			int a = pq.poll();
			int b = pq.poll();
			sum += a + b;
			pq.offer(a + b);
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}