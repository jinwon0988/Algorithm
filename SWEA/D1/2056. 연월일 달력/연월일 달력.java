import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			String input = sc.next();
			int month = Integer.parseInt(input.substring(4, 6));
			int day = Integer.parseInt(input.substring(6, 8));
			if (month < 1 || month > 12) {
				System.out.println("#" + i + " " + -1);
				continue;
			}
			if (month == 2 && (day < 1 || day > 28)) {
				System.out.println("#" + i + " " + -1);
				continue;
			} else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30)) {
				System.out.println("#" + i + " " + -1);
				continue;
			} else if (day < 1 || day > 31) {
				System.out.println("#" + i + " " + -1);
				continue;
			}
			System.out.println(
					"#" + i + " " + input.substring(0, 4) + "/" + input.substring(4, 6) + "/" + input.substring(6, 8));
		}
		sc.close();
	}
}
