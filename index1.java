package ncbai2;

import java.util.Objects;

public class index1 {
    public static final index1 ORIGIN = new index1(0, 0);

    private final double x;
    private final double y;

    public index1(double x, double y) {
        if (Double.isNaN(x) || Double.isNaN(y)) {
            throw new IllegalArgumentException("Coordinates can not be NaN");
        }
        this.x = x;
        this.y = y;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double distanceFromOrigin() {
        return Math.hypot(x, y);
    }

    public index1 reflectionAboutOrigin() {
        return new index1(-x, -y);
    }

    public static index1 midpointOf(index1 p, Point q) {
        return new index1((p.x + q.x) / 2.0, (p.y + q.y) / 2.0);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof index1 other) && x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point[x=" + x + ", y=" + y + "]";
    }
}