import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		StringBuffer sb = new StringBuffer(s1);
		s1 = sb.reverse().toString();
		sb = new StringBuffer(s2);
		s2 = sb.reverse().toString();
		bw.write(Math.max(Integer.parseInt(s1), Integer.parseInt(s2)) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}