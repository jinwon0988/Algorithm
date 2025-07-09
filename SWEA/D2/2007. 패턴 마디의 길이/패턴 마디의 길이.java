import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String input = sc.next();
			int index = 0;
			for (int i = 1; i <= 10; i++) {
				String str = input.substring(0, i);
				boolean isFind = true;
				for (int j = i; j < input.length() - input.length() % str.length(); j += i) {
					if (!str.equals(input.substring(j, j + i))) {
						isFind = false;
						break;
					}
				}
				if (isFind) {
					index = i;
					break;
				}
			}
			System.out.println("#" + tc + " " + input.substring(0, index).length());
		}
		sc.close();
	}
}