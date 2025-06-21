import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		String DNA = br.readLine();
		int[] check = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			check[i] = Integer.parseInt(st.nextToken());
		}
		int[] state = new int[4];
		for (int i = 0; i < P; i++) {
			char ch = DNA.charAt(i);
			switch (ch) {
			case 'A':
				state[0]++;
				break;
			case 'C':
				state[1]++;
				break;
			case 'G':
				state[2]++;
				break;
			case 'T':
				state[3]++;
				break;
			}
		}
		int count = 0;
		if (state[0] >= check[0] && state[1] >= check[1] && state[2] >= check[2] && state[3] >= check[3]) {
			count++;
		}
		for (int i = 0; i < S - P; i++) {
			int e = i + P;
			char ch1 = DNA.charAt(i);
			switch (ch1) {
			case 'A':
				state[0]--;
				break;
			case 'C':
				state[1]--;
				break;
			case 'G':
				state[2]--;
				break;
			case 'T':
				state[3]--;
				break;
			}
			char ch2 = DNA.charAt(e);
			switch (ch2) {
			case 'A':
				state[0]++;
				break;
			case 'C':
				state[1]++;
				break;
			case 'G':
				state[2]++;
				break;
			case 'T':
				state[3]++;
				break;
			}
			if (state[0] >= check[0] && state[1] >= check[1] && state[2] >= check[2] && state[3] >= check[3]) {
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
