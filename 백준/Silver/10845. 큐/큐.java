import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		StringTokenizer st;
		int last = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch (command) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				queue.add(num);
				last = num;
				break;
			case "pop":
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.poll() + "\n");
				break;
			case "size":
				bw.write(queue.size() + "\n");
				break;
			case "empty":
				if (queue.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
				break;
			case "front":
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.peek() + "\n");
				break;
			case "back":
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(last + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
