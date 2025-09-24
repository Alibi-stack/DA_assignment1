
package edu;

import java.util.Random;

public class Utils {
    public static int[] randomArray(int n, long seed){
        Random r = new Random(seed);
        int[] a = new int[n];
        for (int i=0;i<n;i++) a[i] = r.nextInt();
        return a;
    }
    public static boolean isSorted(int[] a){
        for (int i=1;i<a.length;i++) if (a[i-1] > a[i]) return false;
        return true;
    }
    public static void swap(int[] a, int i, int j){
        int t = a[i]; a[i]=a[j]; a[j]=t;
    }
}
