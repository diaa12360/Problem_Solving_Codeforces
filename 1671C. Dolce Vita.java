//problem link: https://codeforces.com/problemset/problem/1671/C

import java.io.*;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.util.List;
import java.util.function.Function;
 
public class Solution {
    final static int N = 200002; // 2*10^5
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        in = new BufferedReader(new FileReader("src/input"));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        int t = ints(in.readLine());
        while(t-- > 0){
            tk = new StringTokenizer(in.readLine());
            int n = ints(tk.nextToken()), x = ints(tk.nextToken());
            Integer[] arr = new Integer[n];
            tk = new StringTokenizer(in.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = ints(tk.nextToken());
            }
            Arrays.sort(arr);
            long sum = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if(sum > x) {
                    break;
                }
                else{
                    ans += (x - sum) / (i + 1) + 1;
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
