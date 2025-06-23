import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0, count = 0;
		for (int i = 0; i < N; i++) {
			int s = Integer.parseInt(st.nextToken());
			if(s > 0) count++;
			else count = 0;
			if(max < count) max = count;
		}
		bw.write(max + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}