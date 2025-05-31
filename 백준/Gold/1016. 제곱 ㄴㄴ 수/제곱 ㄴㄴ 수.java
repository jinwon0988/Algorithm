import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		boolean[] checks = new boolean[(int) (max - min + 1)];
		for (long i = 2; i * i <= max; i++) {
			long db = i * i;
			long index = min / db;
			if (min % db != 0) {
				index++;
			}
			for (long j = index; j * db <= max; j++) {
				checks[(int) (j * db - min)] = true;
			}
		}
		int count = 0;
		for (int i = 0; i < checks.length; i++) {
			if (!checks[i]) {
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
