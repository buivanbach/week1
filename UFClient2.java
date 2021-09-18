import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

import java.util.SortedMap;

public class UFClient2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        int pos = 1;
        int count = 0;
        int res = N -1;
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                count++;
                if(count==res){
                    StdOut.println(pos);
                }
            }
            pos++;
        }
        if(count<res){
            StdOut.println("FAILED");
        }
    }
}