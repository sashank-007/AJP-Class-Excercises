import java.util.Scanner;

public class Palindrome {
//    public static void main(String args[])
//    {
//        String pal;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a string");
//        pal = sc.nextLine();
//
////        int len = pal.length();
////
////        for (int i=len-1;i>=0;i--)
////            rev = rev + pal.charAt(i);
//
//        StringBuilder rev = new StringBuilder();
//        rev.append(pal);
//        rev = rev.reverse();
//        if (pal.equalsIgnoreCase(pal))
//            System.out.println("Given string is a palindrome.");
//        else
//            System.out.println("Given string is not a palindrome.");
//
//    }
public static boolean isPalindrome(String word) {
    // Please write your code here.
    StringBuilder rev = new StringBuilder();
    rev.append(word);
    rev = rev.reverse();
    if(rev.equals(word)){
        return true;
    }else{
        return false;
    }
}
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println(isPalindrome(word));
    }
}
