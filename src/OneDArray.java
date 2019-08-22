import java.util.Scanner;

public class OneDArray {

    int num[] = new int[5];
    int num1[] = {34,56,78};

    public static void main(String[] args) {
        OneDArray one = new OneDArray();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for num array");
        for (int i=0; i<=4; i++) {
            one.num[i]=sc.nextInt();
        }

        System.out.println("The values of num array are:");
        for (int i=0; i<5; i++) {
            System.out.println("num["+i+"] = "+one.num[i]);
        }

        System.out.println("The values of num1 array are:");
        for (int i=0; i<3; i++) {
            System.out.println("num["+i+"] = "+one.num1[i]);
        }
    }
}
