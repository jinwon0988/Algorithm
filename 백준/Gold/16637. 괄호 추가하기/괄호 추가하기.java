import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Long> nums;
	static ArrayList<Character> ops;
	static long result = Integer.MIN_VALUE;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		nums = new ArrayList<>();
		ops = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0)
				nums.add((long) (S.charAt(i) - '0'));
			else
				ops.add(S.charAt(i));
		}
		dfs(0, nums.get(0));
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static void dfs(int idx, long acc) {
		if (idx == ops.size()) {
			result = Math.max(result, acc);
			return;
		}

		long noParen = calculate(acc, nums.get(idx + 1), ops.get(idx));
		dfs(idx + 1, noParen);

		if (idx + 1 < ops.size()) {
			long group = calculate(nums.get(idx + 1), nums.get(idx + 2), ops.get(idx + 1));
			long withParen = calculate(acc, group, ops.get(idx));
			dfs(idx + 2, withParen);
		}
	}

	public static long calculate(long a, long b, char op) {
		if (op == '+')
			return a + b;
		else if (op == '-')
			return a - b;
		return a * b;
	}
}