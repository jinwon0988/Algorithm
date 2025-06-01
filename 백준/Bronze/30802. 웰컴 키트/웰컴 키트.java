import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Long.parseLong(br.readLine());
		long[] T_size = new long[6];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 6; i++) {
			T_size[i] = Long.parseLong(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		long T = Long.parseLong(st.nextToken());
		long P = Long.parseLong(st.nextToken());
		long T_count = 0;
		for (int i = 0; i < 6; i++) {
			if (T_size[i] != 0) {
				T_count += T_size[i] / T;
				if (T_size[i] % T != 0) {
					T_count++;
				}
			}
		}
		bw.write(T_count + "\n");
		bw.write(N / P + " " + N % P + "\n");
		bw.flush();
		bw.close();
	}
}
