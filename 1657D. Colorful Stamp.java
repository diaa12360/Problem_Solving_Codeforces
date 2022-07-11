// problem Link : https://codeforces.com/contest/1657/problem/D
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Solution {
    static Map<Long, Long> mp = new HashMap<>();
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
        int n = ints(tk.nextToken()), C = ints(tk.nextToken());
        long[] maxVal = new long[C + 10];
        for (int i = 0; i < n; i++) {
            tk = new StringTokenizer(in.readLine());
            int c = ints(tk.nextToken()), d = ints(tk.nextToken()), h = ints(tk.nextToken());
            maxVal[c] = Math.max(maxVal[c], (long) d * h);
        }
 
        for (int i = 1; i <= C; i++) {
            for (int j = i * 2; j <= C; j += i) {
                maxVal[j] = Math.max(maxVal[j], maxVal[i] * j / i);
            }
        }
 
        for (int i = 1; i <= C; i++)
            maxVal[i] = Math.max(maxVal[i], maxVal[i - 1]);
 
        int m = ints(in.readLine());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m; i++) {
            tk = new StringTokenizer(in.readLine());
            long D = ll(tk.nextToken());
            long H = ll(tk.nextToken());
            long v = D * H;
            int l = 1, r = C;
            while (l < r) {
                int mid = l + r >> 1;
                if (maxVal[mid] > v) r = mid;
                else l = mid + 1;
            }
            if (maxVal[l] > v) {
                ans.append(l).append(" ");
            } else {
                ans.append("-1").append(" ");
            }
        }
        System.out.print(ans);
    }
  
    static int ints(String s) {
        return Integer.parseInt(s);
    }
 
    static long ll(String s) {
        return Long.parseLong(s);
    }
}
