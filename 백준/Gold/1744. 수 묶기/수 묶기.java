import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> positive_pq = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> negative_pq = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num <= 0)
				negative_pq.add(num);
			else
				positive_pq.add(num);
		}
		int sum = 0;
		if (positive_pq.size() == 1) {
			sum += positive_pq.poll();
		} else if (positive_pq.size() > 1) {
			while (positive_pq.size() > 0) {
				int a = positive_pq.poll();
				int b = positive_pq.poll();
				if (a == 1 || b == 1) {
					sum += a + b;
				} else {
					sum += a * b;
				}
				if (positive_pq.size() == 1) {
					sum += positive_pq.poll();
					break;
				}
			}
		}
		if (negative_pq.size() == 1) {
			sum += negative_pq.poll();
		} else if (negative_pq.size() > 1) {
			while (negative_pq.size() > 0) {
				int a = negative_pq.poll();
				int b = negative_pq.poll();
				sum += a * b;
				if (negative_pq.size() == 1) {
					sum += negative_pq.poll();
					break;
				}
			}
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
}
