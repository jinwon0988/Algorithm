import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int answer = (W / L) * (H / L);
		if (answer > N)
			answer = N;
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
