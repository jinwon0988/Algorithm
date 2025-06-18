import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		minute += time;
		if (minute >= 60) {
			hour += minute / 60;
			minute %= 60;
			if (hour >= 24)
				hour %= 24;
		}
		bw.write(hour + " " + minute + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
