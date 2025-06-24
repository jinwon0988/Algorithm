import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		WH[] wh = new WH[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			wh[i] = new WH(W, H);
		}
		for (int i = 0; i < N; i++) {
			int rank = 1;
			for (int j = 0; j < N; j++) {
				if (i != j) {
					if (wh[i].weight < wh[j].weight && wh[i].height < wh[j].height) {
						rank++;
					}
				}
			}
			bw.write(rank + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	static class WH {
		int weight;
		int height;

		WH(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}
	}
}