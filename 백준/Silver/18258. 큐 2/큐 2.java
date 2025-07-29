import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Queue<Integer> queue = new LinkedList<>();
		int last = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if (command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				queue.add(num);
				last = num;
			} else if (command.equals("pop")) {
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.poll() + "\n");
			} else if (command.equals("size")) {
				bw.write(queue.size() + "\n");
			} else if (command.equals("empty")) {
				if (queue.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
			} else if (command.equals("front")) {
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.peek() + "\n");
			} else {
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(last + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}