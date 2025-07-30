import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int[] A = new int[6];
		for (int i = 0; i < 6; i++) {
			sc.nextInt();
			A[i] = sc.nextInt();
		}
		int[] B = new int[6];
		int max = 0;
		for (int i = 0; i < 6; i++) {
			B[i] = A[i] * A[(i + 1) % 6];
			max = Math.max(max, B[i]);
		}
		int no = 3 * max;
		for (int i = 0; i < 6; i++) {
			no -= B[i];
		}
		System.out.println(K * (max - no));
		sc.close();
	}
}