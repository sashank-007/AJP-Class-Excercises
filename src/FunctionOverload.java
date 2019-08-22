import java.util.Scanner;

public class FunctionOverload {

    public int area(int num1, int num2){
        return (num1*num2);
    }

    float area(int num1){
        return (22/7*num1*num1);
    }

    public static void main(String[] args) {
        int l,b,r,res1;
        float res2;
        Scanner sc = new Scanner(System.in);
        FunctionOverload func = new FunctionOverload();

        System.out.println("Enter length and breadth of rectangle");
        l= sc.nextInt();
        b= sc.nextInt();
        res1= func.area(l,b);

        System.out.println("Enter radius of circle");
        r= sc.nextInt();
        res2= func.area(r);

        System.out.println("Area of  rectangle = "+res1);
        System.out.println("Area of circle = "+res2);
    }
}
