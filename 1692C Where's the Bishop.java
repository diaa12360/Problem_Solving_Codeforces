// problem Link : https://codeforces.com/problemset/problem/1692/C
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
 
public class Soluation {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        int t = anInt(in.readLine());
        while (t-- > 0) {
            in.readLine();
            long count = 0;
            String s;
            boolean isTwo = false, takeIt = false;
            int r = 0, c = 0;
            for (int i = 0; i < 8; i++) {
                s = in.readLine();
                int last = s.lastIndexOf('#');
                int first = s.indexOf('#');
             
                if(first != last)
                    isTwo = true;
                else if(isTwo && !takeIt) {
                    r = i + 1;
                    c = s.indexOf('#') + 1;
                    takeIt = true;
                }
            }
            out.append(r).append(' ').append(c).append('\n');
        }
        System.out.printf("%s", out);
    }
 
    private static int anInt(String s) {
        return Integer.parseInt(s);
    }
}
