import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int S = Integer.parseInt(br.readLine());
		if (S >= 90)
			bw.write("A");
		else if (S >= 80)
			bw.write("B");
		else if (S >= 70)
			bw.write("C");
		else if (S >= 60)
			bw.write("D");
		else
			bw.write("F");
		bw.flush();
		bw.close();
	}
}
