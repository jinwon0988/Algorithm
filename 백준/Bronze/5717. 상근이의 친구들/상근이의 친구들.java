import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            if (m == 0 && f == 0) break;   // 종료 조건
            System.out.println(m + f);     // 각 줄마다 합 출력
        }
        sc.close();
    }
}