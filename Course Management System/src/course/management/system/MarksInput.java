package course.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MarksInput extends JFrame implements ActionListener {

    JLabel lb1, lb2, lb3, lb4;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11;
    JButton btn1;

    MarksInput() {

        setSize(550, 550);
        setLocation(400, 400);
        setLayout(null);

        lb1 = new JLabel("Adding marks of Student");
        lb1.setFont(new Font("Arial", Font.BOLD, 30));
        lb1.setBounds(50, 0, 500, 80);
        add(lb1);

        lb2 = new JLabel("Enter the student ID");
        lb2.setBounds(50, 70, 200, 40);
        add(lb2);

        tf1 = new JTextField();
        tf1.setBounds(180, 80, 200, 20);
        add(tf1);

        lb3 = new JLabel("Enter Course");
        lb3.setBounds(50, 150, 200, 40);
        add(lb3);

        lb4 = new JLabel("Enter Marks of the Students");
        lb4.setBounds(250, 150, 200, 40);
        add(lb4);

        tf2 = new JTextField();
        tf2.setBounds(50, 200, 200, 20);
        add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(250, 200, 200, 20);
        add(tf3);

        tf4 = new JTextField();
        tf4.setBounds(50, 230, 200, 20);
        add(tf4);

        tf5 = new JTextField();
        tf5.setBounds(250, 230, 200, 20);
        add(tf5);

        tf6 = new JTextField();
        tf6.setBounds(50, 260, 200, 20);
        add(tf6);

        tf7 = new JTextField();
        tf7.setBounds(250, 260, 200, 20);
        add(tf7);

        tf8 = new JTextField();
        tf8.setBounds(50, 290, 200, 20);
        add(tf8);

        tf9 = new JTextField();
        tf9.setBounds(250, 290, 200, 20);
        add(tf9);

        tf10 = new JTextField();
        tf10.setBounds(50, 320, 200, 20);
        add(tf10);

        tf11 = new JTextField();
        tf11.setBounds(250, 320, 200, 20);
        add(tf11);

        btn1 = new JButton("Submit");
        btn1.setBounds(50, 360, 100, 30);
        add(btn1);

        btn1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ai) {
        try {
            if (ai.getSource() == btn1) {
                Connections c1 = new Connections();

                String s1 = "insert into course values('" + tf1.getText() + "','" + tf2.getText() + "','"
                        + tf4.getText() + "','" + tf6.getText() + "','" + tf8.getText() + "','" + tf10.getText() + "')";
                String s2 = "insert into marks values('" + tf1.getText() + "','" + tf3.getText() + "','" + tf5.getText()
                        + "','" + tf7.getText() + "','" + tf9.getText() + "','" + tf11.getText() + "')";

                c1.st.executeUpdate(s1);
                c1.st.executeUpdate(s2);

                JOptionPane.showMessageDialog(null, "Student's Marks Added Successfully");
                this.setVisible(false);

            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new MarksInput().setVisible(true);
    }
}