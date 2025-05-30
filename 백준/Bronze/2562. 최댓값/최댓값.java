import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = Integer.parseInt(br.readLine());
		int index = 1;
		for (int i = 2; i <= 9; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num > max) {
				max = num;
				index = i;
			}
		}
		bw.write(max + "\n");
		bw.write(index + "\n");
		bw.flush();
		bw.close();
	}
}
