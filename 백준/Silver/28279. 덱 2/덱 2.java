import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			if (command == 1) {
				int X = Integer.parseInt(st.nextToken());
				deque.offerFirst(X);
			} else if (command == 2) {
				int X = Integer.parseInt(st.nextToken());
				deque.offerLast(X);
			} else if (command == 3) {
				if (deque.size() == 0)
					bw.write("-1\n");
				else
					bw.write(deque.pollFirst() + "\n");
			} else if (command == 4) {
				if (deque.size() == 0)
					bw.write("-1\n");
				else
					bw.write(deque.pollLast() + "\n");
			} else if (command == 5) {
				bw.write(deque.size() + "\n");
			} else if (command == 6) {
				if (deque.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
			} else if (command == 7) {
				if (deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(deque.peekFirst() + "\n");
			} else {
				if (deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(deque.peekLast() + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}