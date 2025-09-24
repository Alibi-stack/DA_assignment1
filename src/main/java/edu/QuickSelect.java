
package edu;

import java.util.Random;

public class QuickSelect {
    public static int select(int[] a, int k, long seed){
        if (k<0 || k>=a.length) throw new IllegalArgumentException();
        Random rnd = new Random(seed);
        int l=0, r=a.length-1;
        while (true){
            int p = l + rnd.nextInt(r - l + 1);
            int pivot = a[p];
            int i=l, j=r;
            while (i<=j){
                while (a[i] < pivot) i++;
                while (a[j] > pivot) j--;
                if (i<=j){ Utils.swap(a, i, j); i++; j--; }
            }
            if (k <= j) r = j;
            else if (k >= i) l = i;
            else return a[k];
        }
    }
}
