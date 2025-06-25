import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			Queue<Node> queue = new LinkedList<>();
			Integer[] A = new Integer[N];
			for (int j = 0; j < N; j++) {
				int value = Integer.parseInt(st.nextToken());
				queue.add(new Node(j, value));
				A[j] = value;
			}
			Arrays.sort(A, Collections.reverseOrder());
			int count = 1;
			for (int j = 0; j < N; j++) {
				while (true) {
					if (A[j] == queue.peek().value) {
						break;
					} else {
						Node n = queue.poll();
						queue.add(n);
					}
				}
				if (queue.peek().index == M) {
					bw.write(count + "\n");
					break;
				} else {
					queue.poll();
					count++;
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	static class Node {
		int index;
		int value;

		Node(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}
}