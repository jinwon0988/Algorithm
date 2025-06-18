import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if (command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				s.push(num);
			} else if (command.equals("pop")) {
				if (s.isEmpty())
					bw.write(-1 + "\n");
				else
					bw.write(s.pop() + "\n");
			} else if (command.equals("size")) {
				bw.write(s.size() + "\n");
			} else if (command.equals("empty")) {
				if (s.isEmpty())
					bw.write(1 + "\n");
				else
					bw.write(0 + "\n");
			} else if (command.equals("top")) {
				if (s.isEmpty())
					bw.write(-1 + "\n");
				else
					bw.write(s.peek() + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
