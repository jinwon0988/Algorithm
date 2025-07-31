import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Deque<Node> deque = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int next = Integer.parseInt(st.nextToken());
			deque.offerLast(new Node(next, i + 1));
		}
		Node n = deque.pollFirst();
		bw.write(n.index + " ");
		while (!deque.isEmpty()) {
			if (n.next > 0) {
				for (int i = 0; i < n.next - 1; i++) {
					deque.offerLast(deque.pollFirst());
				}
				n = deque.pollFirst();
				bw.write(n.index + " ");
			} else {
				for (int i = 0; i > n.next + 1; i--) {
					deque.offerFirst(deque.pollLast());
				}
				n = deque.pollLast();
				bw.write(n.index + " ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	static class Node {
		int next;
		int index;

		Node(int next, int index) {
			this.next = next;
			this.index = index;
		}
	}
}