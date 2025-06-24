import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int count = Integer.MAX_VALUE;
		for(int i=0; i<=N/5; i++) {
			int num = N - i*5;
			int tcount = Integer.MAX_VALUE;
			if(num % 5 == 0) {
				tcount = num / 5 + i;
			}else if(num % 3 == 0) {
				tcount = num / 3 + i;
			}
			if(count > tcount) {
				count = tcount;
			}
		}
		if(count == Integer.MAX_VALUE) bw.write(-1 + "\n");
		else bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}