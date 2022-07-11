// problem Link : https://codeforces.com/problemset/problem/1674/D
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
        while (t-- > 0) {
            int n = ints(in.readLine());
            int[] arr = readArray(in.readLine(), n);
            for (int i = n - 1; i > 0; i -= 2) {
                if (arr[i - 1] > arr[i]) {
                    int tt = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tt;
                }
            }
            out.append(isSorted(arr) ? "YES\n" : "NO\n");
        }
        System.out.println(out);
    }
 
    static boolean isSorted(int[] arr) {
        boolean x = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                x = false;
                break;
            }
        }
        return x;
    }
  
    static int ints(String s) {
        return Integer.parseInt(s);
    }
 
    static long ll(String s) {
        return Long.parseLong(s);
    }
 
    static int[] readArray(String s, int n) {
        StringTokenizer tk = new StringTokenizer(s);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = ints(tk.nextToken());
        return arr;
    }
}
