// problem Link : https://codeforces.com/problemset/problem/1669/F

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
            int ans = 0;
            int sl = 0;
            int sr = 0;
            int lp = 0;
            int rp = n - 1;
            while (lp <= rp)
                if (sl < sr)
                    sl += arr[lp++];
                else if (sr < sl)
                    sr += arr[rp--];
                else {
                    ans = lp + n - rp - 1;
                    sl += arr[lp++];
                }
            if (sl == sr)
                ans = lp + n - 1 - rp;
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
