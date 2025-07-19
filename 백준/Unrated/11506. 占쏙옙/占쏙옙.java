import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("�\n");
		bw.flush();
		bw.close();
	}
}