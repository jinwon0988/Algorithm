import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("\\    /\\\n");
		bw.write(" )  ( ')\n");
		bw.write("(  /  )\n");
		bw.write(" \\(__)|");
		bw.flush();
		bw.close();
	}
}
