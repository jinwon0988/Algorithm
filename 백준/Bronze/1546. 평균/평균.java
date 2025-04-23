import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int sum = 0, max = 0;
		for (int i = 0; i < N; i++) {
			int avg = sc.nextInt();
			sum += avg;
			if (max < avg) {
				max = avg;
			}
		}

		System.out.println(sum * 100.0 / max / N);
	}

}
