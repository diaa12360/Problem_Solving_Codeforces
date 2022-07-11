// problem Link : https://codeforces.com/contest/1644/problem/B
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            for (int i = n; i > 0 ; i--) {
                int x = n;
                for (int j = n; j > 0; j--) {
                    if(j == i)
                        out.append(1).append(' ');
                    else
                        out.append(x--).append(' ');
                }
                out.append('\n');
            }
        }
        System.out.println(out);
    }
}
