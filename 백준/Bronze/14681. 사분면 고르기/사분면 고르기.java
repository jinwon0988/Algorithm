import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		if (X > 0 && Y > 0)
			bw.write(1 + "\n");
		else if (X < 0 && Y > 0)
			bw.write(2 + "\n");
		else if (X < 0 && Y < 0)
			bw.write(3 + "\n");
		else
			bw.write(4 + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
