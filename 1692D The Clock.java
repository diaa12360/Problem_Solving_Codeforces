// problem Link : https://codeforces.com/problemset/problem/1692/D
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Soluation {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        in = new BufferedReader(new FileReader("func.in"));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        int t = anInt(in.readLine());
        while (t-- > 0) {
            tk = new StringTokenizer(in.readLine());
            String s = tk.nextToken();
            int x = anInt(tk.nextToken());
            int h = anInt(s.substring(0, 2));
            int m = anInt(s.substring(3));
            int h1 = h, m1 = m;
            int count = 0;
            do {
                m += x;
                if(m == 60){
                    h++;
                    m = 0;
                }
                else if (m > 60) {
                    h += m / 60 ;
                    m %= 60;
                }
 
                if (h >= 24) {
                    h %= 24;
                }
                String hs = "", ms = "";
                String ms1 = "" + (m%10), ms2 = "" + (m/10);
                hs = ((h < 10) ? "0"+h : ""+h);
                ms = ms1 + ms2;
                if(ms.equals(hs)) {
                    count++;
                }
            } while (m != m1 || h1 != h);
            out.append(count).append('\n');
        }
        System.out.printf("%s", out);
    }
 
    private static int anInt(String s) {
        return Integer.parseInt(s);
    }
}
