import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 1;
		for(int i=0; i<=8; i++) {
			System.out.print(a + " ");
			a *= 2;
		}
		sc.close();
	}
}