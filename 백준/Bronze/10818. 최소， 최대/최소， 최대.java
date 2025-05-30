import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.parseInt(st.nextToken());
		int max = min;
		for (int i = 1; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}
		bw.write(min + " " + max + "\n");
		bw.flush();
		bw.close();
	}
}
