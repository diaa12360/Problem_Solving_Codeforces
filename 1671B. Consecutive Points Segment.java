// prolem Link : https://codeforces.com/problemset/problem/1671/B

import java.io.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader in = new BufferedReader(new FileReader("src/input"));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        int t = ints(in.readLine());
        while (t-- > 0) {
            int n = ints(in.readLine());
            int arr[] = new int[n];
            tk = new StringTokenizer(in.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = ints(tk.nextToken());
            }
            out.append(arr[n-1] - arr[0] > n+1 ? "NO\n" : "YES\n");
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
