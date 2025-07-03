import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A + B == 4) {
			if (A == 1)
				System.out.println("A");
			else
				System.out.println("B");
		} else if (A < B) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
		sc.close();
	}
}
