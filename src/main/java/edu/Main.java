
package edu;

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String algo = "mergesort";
        int n = 100000;
        long seed = 42L;
        for (int i=0;i<args.length;i++){
            if ("--algo".equals(args[i]) && i+1<args.length) algo = args[++i];
            else if ("--n".equals(args[i]) && i+1<args.length) n = Integer.parseInt(args[++i]);
            else if ("--seed".equals(args[i]) && i+1<args.length) seed = Long.parseLong(args[++i]);
        }
        if ("mergesort".equalsIgnoreCase(algo)){
            int[] a = Utils.randomArray(n, seed);
            long t0 = System.currentTimeMillis();
            MergeSortSimple.sort(a);
            long t1 = System.currentTimeMillis();
            System.out.println("sorted="+Utils.isSorted(a)+" time_ms="+(t1-t0));
        } else if ("quicksort".equalsIgnoreCase(algo)){
            int[] a = Utils.randomArray(n, seed);
            long t0 = System.currentTimeMillis();
            QuickSortSimple.sort(a, seed);
            long t1 = System.currentTimeMillis();
            System.out.println("sorted="+Utils.isSorted(a)+" time_ms="+(t1-t0));
        } else if ("select".equalsIgnoreCase(algo)){
            int[] a = Utils.randomArray(n, seed);
            int k = n/2;
            long t0 = System.currentTimeMillis();
            int v = QuickSelect.select(a, k, seed);
            long t1 = System.currentTimeMillis();
            Arrays.sort(a);
            System.out.println("ok="+(v==a[k])+" time_ms="+(t1-t0));
        } else if ("closest".equalsIgnoreCase(algo)){
            Random rnd = new Random(seed);
            ClosestPairBrute.Point[] pts = new ClosestPairBrute.Point[n];
            for (int i=0;i<n;i++) pts[i] = new ClosestPairBrute.Point(rnd.nextDouble(), rnd.nextDouble());
            long t0 = System.currentTimeMillis();
            double d = ClosestPairBrute.closest(pts);
            long t1 = System.currentTimeMillis();
            System.out.println("d="+d+" time_ms="+(t1-t0));
        } else {
            System.out.println("Unknown algo. Use mergesort|quicksort|select|closest");
        }
    }
}
