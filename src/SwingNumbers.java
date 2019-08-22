import javax.swing.*;
import java.awt.event.ActionListener;

public class SwingNumbers {

    JFrame frame;
    JTextField num1, num2, res;
    JButton btn;
    JLabel l1, l2, l3;

   SwingNumbers(){
        frame = new JFrame("Addition");
        btn = new JButton("Add");

        l1 = new JLabel("Enter a number");
        l1.setBounds(50,50,250,30);

        l2 = new JLabel("Enter another number");
        l2.setBounds(50,100,250,30);

        l3 = new JLabel("The addition result is");
        l3.setBounds(50,200,250,30);

        num1 = new JTextField();
        num1.setBounds(300,50,50,30 );

        num2 = new JTextField();
        num2.setBounds(300,100,50,30);

        res = new JTextField();
        res.setBounds(300,200,50,30);

        btn.setBounds(50,150,100,30);

        frame.add(btn);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(num1);
        frame.add(num2);
        frame.add(res);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public int ActionListener(ActionListener ae){
       int a = Integer.parseInt(num1.getText());
       int b = Integer.parseInt(num2.getText());

       int result = (a + b);

       return result;
    }

    public static void main(String args[]){
        new SwingNumbers();
    }

}
