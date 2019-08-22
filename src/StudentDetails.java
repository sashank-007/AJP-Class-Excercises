import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

class studentDetails {
    public String name[][] = new String[10][10];

    void getDetails(int n) {
        Scanner sc = new Scanner(System.in);
        int limit=n;
        System.out.println("Enter " +limit+ " Student Details\n");
        for (int i = 0; i < limit; i++) {
            System.out.println("Enter Student #" + (i + 1) + " Id, Name, Batch & Course:");
            for (int j = 0; j < 4; j++) {
                name[i][j] = sc.nextLine();
            }
        }
    }
}

class ConsultancyOffice {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students:");
        int num = sc.nextInt();
        studentDetails std = new studentDetails();
        std.getDetails(num);
        PrintStream output = new PrintStream(new File("Student_Details.txt"));
        output.println("Id" + "\t" + "Student Name" + "\t" + "Batch" + "\t\t" + "Course");
        output.println("======================================");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                output.print(std.name[i][j] + "\t\t");
            }
            output.println();
            output.println("======================================");
        }
        output.close();
    }
}