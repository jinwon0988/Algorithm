import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int H = 0, M = 0, read = 0;
        String line;
        while (read < 2 && (line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens() && read < 2) {
                int v = Integer.parseInt(st.nextToken());
                if (read == 0) H = v; else M = v;
                read++;
            }
        }

        int minutes = H * 60 + M;
        System.out.println(minutes);
    }
}
