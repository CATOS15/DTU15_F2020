package lektion4.Vector;

public class Vector implements IVector, Comparable<Vector> {
    private double x, y;

    public Vector (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public IVector times (double k) {
        return new Vector(x * k, y * k);
    }
    public IVector add (IVector a) {
        return new Vector(x + ((Vector)a).x, y + ((Vector)a).y);
    }
    public boolean equals(IVector a) {
        return x == ((Vector)a).x && y == ((Vector)a).y;
    }

    public int compareTo(Vector a) {
        double diff = x * y - a.x * a.y;
        return diff < 0 ? -1 : diff > 0 ? 1 : 0;
    }
}
