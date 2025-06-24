import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			String input = br.readLine();
			if (input.equals("."))
				break;
			Stack<String> stack = new Stack<>();
			boolean isRight = true;
			for (int i = 0; i < input.length(); i++) {
				String str = input.substring(i, i + 1);
				if (str.equals("("))
					stack.add("(");
				else if (str.equals("["))
					stack.add("[");
				else if ((str.equals(")") && stack.isEmpty()) || (str.equals("]") && stack.isEmpty())) {
					isRight = false;
					break;
				} else if (str.equals(")")) {
					if (!stack.pop().equals("(")) {
						isRight = false;
						break;
					}
				} else if (str.equals("]")) {
					if (!stack.pop().equals("[")) {
						isRight = false;
						break;
					}
				}
			}
			if (isRight && stack.isEmpty())
				bw.write("yes\n");
			else
				bw.write("no\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}