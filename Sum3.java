import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Sum3 {
    public static void sort(int []a){
        int size = a.length;
        for(int i = 0 ;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j]  = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int n = StdIn.readInt();
        int []a = new int [n];
        for(int i = 0 ; i < n ; i++) a[i] = StdIn.readInt();
        sort(a);
        int left;
        int right;
        for(int i = 0 ;i<n ;i++){
            int x = a[i];
            if(i>0){
                if(x==a[i-1]){
                    continue;
                }
            }
            left = i+1;
            right = a.length-1;
            while (left<right){
                if((x+ a[right]+a[left])==0){
                    StdOut.println("(" + x +" , "+ a[left]+ " and " + a[right]+" )");
                    right --;
                    left++;
                }
                else if ((x+ a[right]+a[left])<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    }
}
