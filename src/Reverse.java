import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
        String pal, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        pal = sc.nextLine();

        int len = pal.length();

        for (int i=len-1;i>=0;i--) {
            rev = rev + pal.charAt(i);
        }

        System.out.println("Reverse string is "+rev);
    }
}
