import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write((int) (Math.random() * 2147483647 + 1) + "\n");
		bw.close();
	}
}