import java.util.*;

public class Solution {
	static int[][] B;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			char[][] A = new char[N + 2][N + 2];
			for (int i = 1; i <= N; i++) {
				char[] input = sc.next().toCharArray();
				for (int j = 1; j <= N; j++) {
					A[i][j] = input[j - 1];
				}
			}
			B = new int[N + 2][N + 2];
			for (int i = 0; i < N + 2; i++) {
				for (int j = 0; j < N + 2; j++) {
					B[i][j] = 2;
				}
			}
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (A[i][j] == '*') {
						B[i][j] = 2;
						continue;
					}
					int c = 0;
					for (int k = i - 1; k <= i + 1; k++) {
						for (int l = j - 1; l <= j + 1; l++) {
							if (A[k][l] == '*') {
								c = 1;
								break;
							}
						}
						if (c == 1)
							break;
					}
					B[i][j] = (c == 1) ? 1 : 0;
				}
			}
			int count = 0;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (B[i][j] == 0) {
						zero(i, j);
						count++;
					}
				}
			}
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (B[i][j] == 1)
						count++;
				}
			}
			System.out.println("#" + test_case + " " + count);
		}
		sc.close();
	}

	public static void zero(int r, int c) {
		B[r][c] = 2;
		for (int i = r - 1; i <= r + 1; i++) {
			for (int j = c - 1; j <= c + 1; j++) {
				if (B[i][j] == 0)
					zero(i, j);
				B[i][j] = 2;
			}
		}
	}
}