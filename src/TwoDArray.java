import java.util.Scanner;

public class TwoDArray {

    int num1[][] = new int[2][2];
    int num2[][] = new int[2][2];
    int res[][] = new int[2][2];

    public static void main(String[] args) {
        int i,j;

        Scanner sc = new Scanner(System.in);

        TwoDArray two = new TwoDArray();
        System.out.println("Enter Value for first 2x2 matrix");
        for(i=0;i<2;i++){
            for (j=0;j<2;j++){
                System.out.print("num1["+i+"]["+j+"]");
                two.num1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter Value for second 2x2 matrix");
        for(i=0;i<2;i++){
            for (j=0;j<2;j++){
                System.out.print("num2["+i+"]["+j+"]");
                two.num2[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("First matrix is");
        for(i=0;i<2;i++){
            for (j=0;j<2;j++){
                System.out.print(two.num1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Second matrix is");
        for(i=0;i<2;i++){
            for (j=0;j<2;j++){
                System.out.print(two.num2[i][j]+" ");
            }
            System.out.println();
        }

        for(i=0;i<2;i++){
            for (j=0;j<2;j++){
                two.res[i][j] = two.num1[i][j] + two.num2[i][j];
            }
        }

        System.out.println("Result is");
        for(i=0;i<2;i++){
            for (j=0;j<2;j++){
                System.out.print(two.res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
