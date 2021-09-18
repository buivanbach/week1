import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class C2Bai2 {
    public static void main(String[] args) {
        double degrees = StdIn.readDouble();
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        StdOut.println(sin * sin + cos * cos);
        int a = Integer.MAX_VALUE;
        System.out.println(4*a);
    }
}