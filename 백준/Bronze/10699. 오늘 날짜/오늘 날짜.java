import java.io.*;
import java.time.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(LocalDate.now() + "\n");
		bw.close();
		br.close();
	}
}