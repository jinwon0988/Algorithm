import java.io.*;
import java.util.*;

public class Main {
	static int[] myArr;
	static int[] checkArr;
	static int checkSecret;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		char[] A = new char[S];
		A = br.readLine().toCharArray();
		checkArr = new int[4];
		st = new StringTokenizer(br.readLine());
		checkSecret = 0;
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0)
				checkSecret++;
		}
		myArr = new int[4];
		for (int i = 0; i < P; i++) {
			Add(A[i]);
		}
		int count = 0;
		if (checkSecret == 4)
			count++;
		for (int j = P; j < S; j++) {
			int i = j - P;
			Add(A[j]);
			Remove(A[i]);
			if (checkSecret == 4)
				count++;
		}
		System.out.println(count);
		br.close();
	}

	private static void Add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if (myArr[0] == checkArr[0])
				checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if (myArr[1] == checkArr[1])
				checkSecret++;
			break;
		case 'G':
			myArr[2]++;
			if (myArr[2] == checkArr[2])
				checkSecret++;
			break;
		case 'T':
			myArr[3]++;
			if (myArr[3] == checkArr[3])
				checkSecret++;
			break;
		}
	}

	private static void Remove(char c) {
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0])
				checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if (myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if (myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if (myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;
		}
	}
}
