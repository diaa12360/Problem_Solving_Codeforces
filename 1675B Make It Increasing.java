
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
            int n = ints(in.readLine()), count = 0;
            int[] arr = readArray(in.readLine(), n);
            boolean ans = true;
            for (int i = n-1; i > 0; i--) {
                if(arr[i] <= arr[i-1]){
                    while (arr[i] <= arr[i-1]){
                        count++;
                        arr[i-1] /= 2;
                        if(arr[i] == 0 && arr[i-1] == 0) {
                            ans = false;
                            break;
                        }
                    }
                }
            }
            out.append(ans ? count : -1).append('\n');
        }
        System.out.println(out);
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
 
