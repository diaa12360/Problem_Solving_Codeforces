import java.io.*;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.util.List;
import java.util.function.Function;
 
public class Solution {
    final static int N = 200002; // 2*10^5
//                       200000
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        in = new BufferedReader(new FileReader("src/input"));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        int t = ints(in.readLine());
        while(t-- > 0){
            String ss = in.readLine();
            long r = (ss.charAt(0) - 'a') * 25;
            long c = (int)ss.charAt(1) - 'a';
            if(ss.charAt(1) > ss.charAt(0))
                c--;
            out.append(r + c + 1).append('\n');
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
