import java.util.*;

public class Solution {
	static int result;
	static int N, B;
	static int[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			B = sc.nextInt();
			A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			result = Integer.MAX_VALUE;
			DFS(0, 0);
			System.out.println("#" + tc + " " + (result - B));
		}
		sc.close();
	}

	public static void DFS(int idx, int sum) {
		if (sum >= result)
			return;
		if (sum >= B) {
			result = sum;
			return;
		}
		if (idx == N)
			return;
		DFS(idx + 1, sum + A[idx]);
		DFS(idx + 1, sum);
	}
}