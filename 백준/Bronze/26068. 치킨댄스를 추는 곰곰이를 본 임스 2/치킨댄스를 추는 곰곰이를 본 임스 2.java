import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < N; i++) {
			String gift = br.readLine();
			int day = Integer.parseInt(gift.substring(2, gift.length()));
			if (day <= 90)
				count++;
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}