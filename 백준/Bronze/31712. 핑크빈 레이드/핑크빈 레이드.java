import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int CU = Integer.parseInt(st.nextToken());
		int DU = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int CD = Integer.parseInt(st.nextToken());
		int DD = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int CP = Integer.parseInt(st.nextToken());
		int DP = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(br.readLine());
		int time = -1;
		while (H > 0) {
			time++;
			if (time % CU == 0)
				H -= DU;
			if (time % CD == 0)
				H -= DD;
			if (time % CP == 0)
				H -= DP;
		}
		bw.write(time + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}