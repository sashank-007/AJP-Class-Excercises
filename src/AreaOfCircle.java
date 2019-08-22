import java.awt.geom.Area;
import java.util.Scanner;

public class AreaOfCircle{

    public double getArea(double r){
        double res = 22/7*r*r;

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double result = new AreaOfCircle().getArea(radius);

        System.out.println("area is "+result);

    }
}
