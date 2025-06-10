import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 1; i < N; i++) {
			int sum = 0;
			int num = i;
			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if (sum + i == N) {
				result = i;
				break;
			}
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
