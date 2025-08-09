import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String str = "";
		for (int i = 0; i < N; i++)
			str += br.readLine();
		boolean isEmpty = true;
		if (!str.contains("keys")) {
			bw.write("keys\n");
			isEmpty = false;
		}
		if (!str.contains("phone")) {
			bw.write("phone\n");
			isEmpty = false;
		}
		if (!str.contains("wallet")) {
			bw.write("wallet\n");
			isEmpty = false;
		}
		if (isEmpty)
			bw.write("ready\n");
		bw.flush();
		bw.close();
		br.close();
	}
}