import java.io.*;
import java.util.*;

public class Main {
	static int[] bucket;
	static int[] Sender = { 0, 0, 1, 1, 2, 2 };
	static int[] Receiver = { 1, 2, 0, 2, 0, 1 };
	static boolean[][] visited;
	static boolean[] answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		bucket = new int[3];
		for (int i = 0; i < 3; i++) {
			bucket[i] = Integer.parseInt(st.nextToken());
		}
		visited = new boolean[201][201];
		answer = new boolean[201];
		BFS();
		for (int i = 0; i < answer.length; i++) {
			if (answer[i])
				bw.write(i + " ");
		}
		bw.flush();
		bw.close();
	}

	public static void BFS() {
		Queue<AB> queue = new LinkedList<>();
		queue.add(new AB(0, 0));
		visited[0][0] = true;
		answer[bucket[2]] = true;
		while (!queue.isEmpty()) {
			AB p = queue.poll();
			int A = p.A;
			int B = p.B;
			int C = bucket[2] - A - B;
			for (int k = 0; k < 6; k++) {
				int[] next = { A, B, C };
				next[Receiver[k]] += next[Sender[k]];
				next[Sender[k]] = 0;
				if (next[Receiver[k]] > bucket[Receiver[k]]) {
					next[Sender[k]] = next[Receiver[k]] - bucket[Receiver[k]];
					next[Receiver[k]] = bucket[Receiver[k]];
				}
				if (!visited[next[0]][next[1]]) {
					visited[next[0]][next[1]] = true;
					queue.add(new AB(next[0], next[1]));
					if (next[0] == 0) {
						answer[next[2]] = true;
					}
				}
			}
		}
	}

	public static class AB {
		int A;
		int B;

		public AB(int A, int B) {
			this.A = A;
			this.B = B;
		}
	}
}
