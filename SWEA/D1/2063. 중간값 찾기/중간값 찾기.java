import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] A = new int[T];
		for (int test_case = 1; test_case <= T; test_case++) {
			A[test_case - 1] = sc.nextInt();
		}
		Arrays.sort(A);
		System.out.println(A[T / 2]);
		sc.close();
	}
}
