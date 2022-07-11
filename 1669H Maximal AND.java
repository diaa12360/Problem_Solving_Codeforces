// problem Link : https://codeforces.com/problemset/problem/1669/H
import java.io.*;
import java.net.Inet4Address;
import java.util.*;
import java.util.List;
import java.util.function.Function;
 
public class Solution {
    final static int N = 200002; // 2*10^5
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader in = new BufferedReader(new FileReader("src/input"));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        int t = ints(in.readLine());
        while (t-- > 0){
            tk = new StringTokenizer(in.readLine());
            int n = ints(tk.nextToken()), k = ints(tk.nextToken());
            int[] arr = new int[n], count = new int[31];
            tk = new StringTokenizer(in.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = ints(tk.nextToken());
                for (int j = 30; j >= 0; j--) {
                    if((arr[i] & (1 << j)) > 0)
                        count[j]++;
                }
            }
            int ans = 0;
            for (int i = 30; i >= 0; i--) {
                int a = n - count[i];
                if(a <= k){
                    k -= a;
                    ans += (1 << i);
                }
            }
            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
 
    static int ints(String s) {
        return Integer.parseInt(s);
    }
 
    static long ll(String s) {
        return Long.parseLong(s);
    }
}
