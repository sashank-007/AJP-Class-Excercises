import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentService {

    Connection con = new DBConnect().getConnection();
    public  Students getKathmanduStudents(){

        Students students = new Students();
        String query = "select name from student where district='kathmandu'";

        try {
            PreparedStatement pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()){
                students.setName(rs.getString("name"));
                System.out.println(students.name);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return students;
    }
}
