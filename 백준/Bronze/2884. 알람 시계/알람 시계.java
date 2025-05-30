import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		if (M < 45) {
			M = 60 - 45 + M;
			if (H == 0)
				H = 23;
			else
				H--;
		} else
			M -= 45;
		bw.write(H + " " + M + "\n");
		bw.flush();
		bw.close();
	}
}
