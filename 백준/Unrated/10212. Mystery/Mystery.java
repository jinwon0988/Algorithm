import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		if ((int) (Math.random() * 2) == 0) {
			bw.write("Korea\n");
		} else {
			bw.write("Yonsei\n");
		}
		bw.close();
	}
}