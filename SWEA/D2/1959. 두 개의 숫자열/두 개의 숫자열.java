import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[M];
			for (int j = 0; j < N; j++) {
				A[j] = sc.nextInt();
			}
			for (int j = 0; j < M; j++) {
				B[j] = sc.nextInt();
			}
			int max = Integer.MIN_VALUE;
			if (N <= M) {
				for (int j = 0; j <= M - N; j++) {
					int sum = 0;
					for (int k = j, l = 0; k < j + N; k++, l++) {
						sum += A[l] * B[k];
					}
					if (sum > max) {
						max = sum;
					}
				}
			} else {
				for (int j = 0; j <= N - M; j++) {
					int sum = 0;
					for (int k = j, l = 0; k < j + M; k++, l++) {
						sum += A[k] * B[l];
					}
					if (sum > max) {
						max = sum;
					}
				}
			}
			System.out.println("#" + i + " " + max);
		}
		sc.close();
	}
}