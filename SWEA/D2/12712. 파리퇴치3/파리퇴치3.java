import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] A = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					A[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int sum = A[i][j];
					// +
					for (int k = 1; k < M; k++) {
						if (j - k >= 0)
							sum += A[i][j - k]; // 왼쪽
						if (i - k >= 0)
							sum += A[i - k][j]; // 위
						if (j + k < N)
							sum += A[i][j + k]; // 오른쪽
						if (i + k < N)
							sum += A[i + k][j]; // 아래
					}
					if (sum > max) {
						max = sum;
					}
					sum = A[i][j];
					// x
					for (int k = 1; k < M; k++) {
						if (i - k >= 0 && j - k >= 0)
							sum += A[i - k][j - k]; // 왼쪽 위
						if (i - k >= 0 && j + k < N)
							sum += A[i - k][j + k]; // 오른쪽 위
						if (i + k < N && j + k < N)
							sum += A[i + k][j + k]; // 오른쪽 아래
						if (i + k < N && j - k >= 0)
							sum += A[i + k][j - k]; // 왼쪽 아래
					}
					if (sum > max) {
						max = sum;
					}
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
		sc.close();
	}
}