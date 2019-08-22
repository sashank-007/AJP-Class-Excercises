public class Variable {

    //Local Variable

    public int Add(){
        System.out.println("Implentation of Local Variable");
        int num = 0;
        num = num + 528;

        return num;
    }

    //Instance Variable

    public String student_name;
    public String student_roll;
    private String student_address;

    public void Student(String name){
        student_name = name;
    }

    public void setStudent_roll(String student_roll) {
        this.student_roll = student_roll;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public void studentDetails(){
        System.out.println("Implementation of Instance Variable");
        System.out.println("Student Name: "+student_name);
        System.out.println("Student Roll: "+student_roll);
        System.out.println("Student Address: "+student_address);
    }

    //Class Variable

    public static String batch;
    public static final String MAJOR = "Computer Science";

    public static void main(String[] args) {

        Variable var = new Variable();
        System.out.println(var.Add());

        var.Student("Sashank Shakya");
        var.setStudent_roll("528");
        var.setStudent_address("Kathmandu");

        var.studentDetails();

        batch = "CSIT 2075/019";
        System.out.println("Batch: "+batch+" Major: "+MAJOR);
    }


}
