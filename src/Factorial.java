import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int num;
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for calculating factorial");
        num = sc.nextInt();

        while (num > 0){
            fact *=num;
            --num;
        }

        System.out.println("Using while, Factorial is "+fact);

        do {
            fact*=num;
            --num;
        }while (num>0);

        System.out.println("Using do while, Factorial is "+fact);

    }
}
