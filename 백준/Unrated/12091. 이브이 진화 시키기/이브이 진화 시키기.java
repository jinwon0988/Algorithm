import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int L = Integer.parseInt(br.readLine());
		int num = (int)(Math.random()*3);
		if(num == 0) bw.write("Vaporeon\n");
		else if(num == 1) bw.write("Jolteon\n");
		else bw.write("Flareon\n");
		bw.flush();
		bw.close();
	}
}