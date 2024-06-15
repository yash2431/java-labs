class Circle{
    double radius;
        double area(){
            return Math.PI*radius*radius;
        }
}
public class Circle1{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=20.0;
        System.out.println(c1.area());
    }
}