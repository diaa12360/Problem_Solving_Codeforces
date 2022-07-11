// problem Link : https://codeforces.com/contest/1674/problem/C
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
            String s = in.readLine();
            String temp = in.readLine();
            int count = 0;
            for (char x : temp.toCharArray()) {
                if (x == 'a')
                    count++;
            }
            if (count == 0) {
                long ans = (long)Math.pow(2, s.length());
                out.append(ans);
            } else if (count == 1 && temp.length() == 1) {
                out.append("1");
            }
            else {
                out.append("-1");
            }
            out.append('\n');
        }
        System.out.println(out);
    }
  
  
    static int ints(String s) {
        return Integer.parseInt(s);
    }
 
    static long ll(String s) {
        return Long.parseLong(s);
    }
}
 
