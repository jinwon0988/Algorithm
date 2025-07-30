import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		double result = a - (double) a * b / 100.0;
		if (result >= 100)
			bw.write("0\n");
		else
			bw.write("1\n");
		bw.flush();
		bw.close();
		br.close();
	}
}