import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			int max = A[N - 1];
			long result = 0;
			for (int i = N - 2; i >= 0; i--) {
				if (max < A[i]) {
					max = A[i];
				} else {
					result += max - A[i];
				}
			}
			System.out.println("#" + tc + " " + result);
		}
		sc.close();
	}
}