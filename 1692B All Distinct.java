// problem Link : https://codeforces.com/contest/1692/problem/B
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
            long count = 0;
            int n = anInt(in.readLine());
            int []arr = new int[n];
            tk = new StringTokenizer(in.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = anInt(tk.nextToken());
            }
            count = Arrays.stream(arr).distinct().count();
            long d = n - count;
            if(d%2 == 1){
                count--;
            }
            out.append(count).append('\n');
        }
        System.out.printf("%s", out);
    }
 
    private static int anInt(String s) {
        return Integer.parseInt(s);
    }
}
