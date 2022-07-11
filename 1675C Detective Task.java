// problem Link : https://codeforces.com/contest/1675/problem/C
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
            char[] arr = in.readLine().toCharArray();
            if(arr.length == 1)
                out.append(1);
            else {
                int l = arr.length - 1, r = 0;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] == '0') {
                        l = i;
                        break;
                    }
                }
                for (int i = arr.length-1; i >= 0; i--) {
                    if(arr[i] == '1'){
                        r = i;
                        break;
                    }
                }
                out.append(Math.abs(l-r) + 1);
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
