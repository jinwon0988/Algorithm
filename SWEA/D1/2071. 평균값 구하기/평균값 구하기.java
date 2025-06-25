import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			double sum = 0.0;
			for (int j = 0; j < 10; j++) {
				sum += sc.nextInt();
			}
			System.out.println("#" + test_case + " " + Math.round(sum / 10.0));
		}
		sc.close();
	}
}
