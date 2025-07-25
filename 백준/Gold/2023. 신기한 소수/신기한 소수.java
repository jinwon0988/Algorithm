import java.io.*;

public class Main {
	static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
		br.close();
	}

	static void DFS(int number, int jarisu) {
		if (jarisu == N) {
			if (isPrime(number)) {
				System.out.println(number);
			}
			return;
		}
		for (int i = 1; i < 10; i += 2) {
			if (isPrime(number * 10 + i)) {
				DFS(number * 10 + i, jarisu + 1);
			}
		}
	}

	static boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}