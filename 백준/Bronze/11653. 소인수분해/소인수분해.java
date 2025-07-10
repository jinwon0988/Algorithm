import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int div = 2;
		while (N > 1) {
			if (N % div == 0) {
				bw.write(div + "\n");
				N /= div;
			} else {
				div++;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}