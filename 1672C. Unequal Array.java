// problem Link : https://codeforces.com/problemset/problem/1672/C

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
//        BufferedReader in = new BufferedReader(new FileReader("src/input"));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        int t = ints(in.readLine());
        while (t-- > 0) {
            int n = ints(in.readLine());
            tk = new StringTokenizer(in.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = ints(tk.nextToken());
            }
            int min = -1, max = -1;
            for (int i = 1; i < n; i++) {
                if(arr[i] == arr[i-1]){
                    if(min == -1)
                        min = i;
                    max = i;
                }
            }
            out.append(max == min ? 0 : Math.max(max - min - 1, 1)).append('\n');
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
