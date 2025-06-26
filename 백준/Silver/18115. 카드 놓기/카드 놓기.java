import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		}
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = N - 1; i >= 0; i--) {
			int command = Integer.parseInt(st.nextToken());
			if (command == 1) {
				A[i] = deque.pollFirst();
			} else if (command == 2 && deque.size() >= 2) {
				int temp = deque.pollFirst();
				A[i] = deque.pollFirst();
				deque.offerFirst(temp);
			} else if (command == 3 && deque.size() >= 2) {
				A[i] = deque.pollLast();
			}
		}
		int[] result = new int[N];
		for (int i = 0; i < N; i++) {
			result[A[i] - 1] = i + 1;
		}
		for (int i = 0; i < N; i++) {
			bw.write(result[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}