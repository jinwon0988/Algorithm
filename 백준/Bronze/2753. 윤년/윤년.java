import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int Y = Integer.parseInt(br.readLine());
		if ((Y % 4 == 0 && Y % 100 != 0) || Y % 400 == 0)
			bw.write(1 + "\n");
		else
			bw.write(0 + "\n");
		bw.flush();
		bw.close();
	}
}
