import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] A = new String[N];
		for (int i = 0; i < N; i++) {
			A[i] = String.valueOf(i + 1);
			if (A[i].contains("3") || A[i].contains("6") || A[i].contains("9")) {
				int count = 0;
				for (int j = 0; j < A[i].length(); j++) {
					if (A[i].charAt(j) == '3' || A[i].charAt(j) == '6' || A[i].charAt(j) == '9') {
						count++;
					}
				}
				A[i] = "-";
				for (int j = 1; j < count; j++) {
					A[i] += "-";
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(A[i] + " ");
		}
		sc.close();
	}
}