import java.lang.Math;

public class ThreeDPoint extends MyPoint {
    private double z;

    public ThreeDPoint() {
        this(0, 0, 0);
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double distance(MyPoint anotherPoint) {
        if (!(anotherPoint instanceof ThreeDPoint)) {
            return super.distance(anotherPoint);
        }

        ThreeDPoint point3D = (ThreeDPoint) anotherPoint;
        double dx = this.getX() - point3D.getX();
        double dy = this.getY() - point3D.getY();
        double dz = this.z - point3D.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);

        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
    }
}
