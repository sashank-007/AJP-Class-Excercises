import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SimpleInterest extends JFrame implements ActionListener {
    JLabel l1 = new JLabel("Principal:");
    JLabel l2 = new JLabel("Time:");
    JLabel l3 = new JLabel("Rate:");
    JLabel l4 = new JLabel("Result is");
    JTextField t1 = new JTextField(30);
    JTextField t2 = new JTextField(30);
    JTextField t3 = new JTextField(30);
    JTextField t4 = new JTextField(30);
    JButton b1 = new JButton("Calculate");
    JButton b2 = new JButton("Clear");
    SimpleInterest() {
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

        t4.setEditable(false);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            double pr = Double.parseDouble(t1.getText());
            double ti = Double.parseDouble(t2.getText());
            double ra = Double.parseDouble(t3.getText());
            double in = (pr * ti * ra) / 100;
            t4.setText(String.valueOf(in));
        }else if (e.getSource()==b2){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }else {
            JOptionPane.showMessageDialog(null,"error");
        }
    }
    public static void main(String[] args) {
        new SimpleInterest();
    }
}