import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value for num1");
        num1 = s.nextInt();

        System.out.println("Enter value for num2");
        num2 = s.nextInt();

        System.out.println("Before Swap num1 = "+num1+ " num2 = "+num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swap num1 = "+num1+ " num2 = "+num2);
    }
}
