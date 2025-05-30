import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int mul = A * B * C;
		String str_mul = Integer.toString(mul);
		int[] count = new int[10];
		for (int i = 0; i < str_mul.length(); i++) {
			count[Integer.parseInt(str_mul.substring(i, i + 1))]++;
		}
		for (int i = 0; i < 10; i++) {
			bw.write(count[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
