import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += T % 10;
			T /= 10;
		}
		System.out.println(sum);
		sc.close();
	}
}
