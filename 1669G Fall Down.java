// problem Link : https://codeforces.com/problemset/problem/1669/G
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader in = new BufferedReader(new FileReader("src/input"));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        int t = ints(in.readLine());
        while (t-- > 0) {
            String s[] = in.readLine().split(" ");
            int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
            char g[][] = new char[n][m], ans[][] = new char[n][m];
            int i, j;
 
            for (i = 0; i < n; i++) {
                String st = in.readLine();
                for (j = 0; j < m; j++) {
                    g[i][j] = st.charAt(j);
                    ans[i][j] = '.';
                    if (g[i][j] == 'o') ans[i][j] = 'o';
                }
            }
 
            for (i = 0; i < m; i++) {
                int stone = 0, k;
                for (j = 0; j < n; j++)
                    if (g[j][i] == '*') stone++;
                    else if (g[j][i] == 'o') {
                        k = j - 1;
                        while (stone-- > 0) ans[k--][i] = '*';
                        stone = 0;
                    }
 
                k = j - 1;
                while (stone-- > 0) ans[k--][i] = '*';
            }
 
            for (i = 0; i < n; i++)
                out.append(ans[i]).append('\n');
            out.append('\n');
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
