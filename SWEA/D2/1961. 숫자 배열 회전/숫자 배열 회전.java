import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			String[][] A = new String[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					A[i][j] = sc.next();
				}
			}
			System.out.println("#" + test_case);
			for (int i = 0; i < N; i++) {
				for (int j = N - 1; j >= 0; j--) {
					System.out.print(A[j][i]);
				}
				System.out.print(" ");
				for (int j = N - 1; j >= 0; j--) {
					System.out.print(A[N - i - 1][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < N; j++) {
					System.out.print(A[j][N - i - 1]);
				}
				System.out.println();
			}
		}
		sc.close();
	}
}