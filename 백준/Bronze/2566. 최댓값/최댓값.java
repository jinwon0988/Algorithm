import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int max = 0;
		int[] index = { 1, 1 };
		for (int i = 1; i <= 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 9; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (max < num) {
					max = num;
					index[0] = i;
					index[1] = j;
				}
			}
		}
		bw.write(max + "\n");
		bw.write(index[0] + " " + index[1] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}