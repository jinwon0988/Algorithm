import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int sum = 0;
		int result = 1;
		for (int i = a; i <= b; i++) {
			sum = 0;
			for (int j = 1; j <= i; j++) {
				sum = (sum + j) % 14579;
			}
			result = (result * sum) % 14579;
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}