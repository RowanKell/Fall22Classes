import java.util.ArrayList;
public class CirclesCountry {
    public double distance(double x, double y, double x1, double y1) {
        double insideRoot = (x1 - x) * (x1 - x) + (y1 - y) * (y1 -y);
        return Math.sqrt(insideRoot);
    }
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
        ArrayList<Integer> circlesInside = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++) {
            if(distance(x[i], y[i], x1, y1) < r[i]) {
                circlesInside.add(i);
            }
        }
        for(int i = 0; i < x.length; i++) {
            if(distance(x[i], y[i], x2, y2) < r[i]) {
                if(circlesInside.contains(i)) {
                    circlesInside.remove(circlesInside.indexOf(i));
                }
                else {
                    circlesInside.add(i);
                }
            }
        }
        return circlesInside.size();
    }
}