import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			long A = sc.nextLong();
			long B = sc.nextLong();
			long N = sc.nextLong();
			int count = 0;
			while (A <= N && B <= N) {
				if (A <= B) {
					A += B;
					count++;
				} else {
					B += A;
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}