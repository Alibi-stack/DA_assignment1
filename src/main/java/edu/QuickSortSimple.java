
package edu;

import java.util.Random;

public class QuickSortSimple {
    public static void sort(int[] a, long seed){
        Random rnd = new Random(seed);
        sort(a, 0, a.length-1, rnd);
    }
    private static void sort(int[] a, int l, int r, Random rnd){
        if (l>=r) return;
        int p = l + rnd.nextInt(r - l + 1);
        int pivot = a[p];
        int i=l, j=r;
        while (i<=j){
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i<=j){
                Utils.swap(a, i, j);
                i++; j--;
            }
        }
        if (l<j) sort(a, l, j, rnd);
        if (i<r) sort(a, i, r, rnd);
    }
}
