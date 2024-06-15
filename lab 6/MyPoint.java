import java.lang.Math;

public class MyPoint {
     double x;
     double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint anotherPoint) {
        double dx = this.x - anotherPoint.x;
        double dy = this.y - anotherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(); 
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        System.out.println("Distance between p1 and (5, 6): " + p1.distance(5, 6));
    }
}
