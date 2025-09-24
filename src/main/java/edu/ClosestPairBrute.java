
package edu;

public class ClosestPairBrute {
    public static record Point(double x, double y){}
    public static double closest(Point[] pts){
        double best = Double.POSITIVE_INFINITY;
        for (int i=0;i<pts.length;i++){
            for (int j=i+1;j<pts.length;j++){
                double dx = pts[i].x()-pts[j].x();
                double dy = pts[i].y()-pts[j].y();
                double d = Math.hypot(dx, dy);
                if (d < best) best = d;
            }
        }
        return best;
    }
}
