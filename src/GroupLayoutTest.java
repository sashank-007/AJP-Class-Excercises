import javax.swing.*;
public class GroupLayoutTest extends JFrame {
    public GroupLayoutTest() {
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        JButton one = new JButton("Button 1");
        JButton two = new JButton("Button 2");
        JButton three = new JButton("Button 3");
        JButton four = new JButton("Button 4");

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(one)
                        .addComponent(two)
                        ) //first group
                .addGroup(layout.createSequentialGroup()
                        .addComponent(four))
                        .addComponent(three));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(one).addComponent(two))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(three)).addComponent(four));
        panel.setLayout(layout);
        add(panel);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GroupLayoutTest();
    }
}