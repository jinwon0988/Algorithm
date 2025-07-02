import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] - 'A' + 1 + " ");
		}
		sc.close();
	}
}
