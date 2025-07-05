import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long result = 0;
		long prev = Integer.parseInt(br.readLine());
		for (int i = 1; i < N; i++) {
			long now = Integer.parseInt(br.readLine());
			long diff = now - prev;
			result += diff * diff;
			prev = now;
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}