import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] A = new int[10];
		for (int test_case = 1; test_case <= T; test_case++) {
			for (int i = 0; i < 10; i++) {
				A[i] = sc.nextInt();
			}
			Arrays.sort(A);
			System.out.println("#" + test_case + " " + A[9]);
		}
		sc.close();
	}
}