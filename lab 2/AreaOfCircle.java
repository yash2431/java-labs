import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        double area,radius;
        radius = sc.nextDouble();
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle is :" + area);
    }
    
}
