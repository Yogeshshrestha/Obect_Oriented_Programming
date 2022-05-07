package course.management.system;

import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;

class AddStudentCourse implements ActionListener {

    JFrame frame;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField tf1, tf2, tf3;
    JButton b1, b2;
    JComboBox cb1, cb2;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    public AddStudentCourse() {
        frame = new JFrame("Add course");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        l5 = new JLabel();
        l5.setBounds(0, 0, 600, 600);
        l5.setLayout(null);

        l4 = new JLabel("New Course");
        l4.setBounds(215, 25, 500, 45);
        l4.setFont(new Font("Arial", Font.BOLD, 25));
        l4.setForeground(Color.black);
        l5.add(l4);
        frame.add(l5);

        l1 = new JLabel("Course Name");
        l1.setBounds(45, 145, 95, 25);
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l5.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(200, 145, 145, 25);
        l5.add(tf1);

        l2 = new JLabel("Module");
        l2.setBounds(45, 200, 95, 25);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l5.add(l2);

        tf2 = new JTextField();
        tf2.setBounds(200, 200, 145, 25);
        l5.add(tf2);

        l3 = new JLabel("Course Id");
        l3.setBounds(45, 245, 95, 25);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l5.add(l3);

        tf3 = new JTextField();
        tf3.setBounds(200, 245, 145, 25);
        tf3.setText("299"+first);
        l5.add(tf3);

        l6 = new JLabel("Semester");
        l6.setBounds(45, 350, 145, 25);
        l6.setFont(new Font("Arial", Font.BOLD, 20));
        l5.add(l6);

        String semister[] = { "1", "2", "3", "4", "5", "6","7","8" };
        cb1 = new JComboBox(semister);
        cb1.setBackground(Color.WHITE);
        cb1.setBounds(200, 350, 145, 25);
        l5.add(cb1);

        l7 = new JLabel("Faculty");
        l7.setBounds(45, 300, 145, 25);
        l7.setFont(new Font("Arial", Font.BOLD, 20));
        l5.add(l7);

        String branch[] = { "BIT", "BBA", "BBS", "BIM", "BSCIT" };
        cb2 = new JComboBox(branch);
        cb2.setBackground(Color.WHITE);
        cb2.setBounds(200, 300, 145, 25);
        l5.add(cb2);

        b1 = new JButton("ADD");
        b1.setBounds(145, 450, 145, 40);

        l5.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(350, 450, 145, 40);

        l5.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setLocation(400, 145);
    }

    public void actionPerformed(ActionEvent ai) {

        String a = tf1.getText();
        String e = tf2.getText();
        String i = tf3.getText();
        String o = (String) cb1.getSelectedItem();
        String u = (String) cb2.getSelectedItem();

        if (ai.getSource() == b1) {
            try {
                Connections cc = new Connections();
                String q = "insert into students values('" + a + "','" + e + "','" + i + "','" + o + "','" + u + "')";
                cc.st.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Student's course added Successfully");
                frame.setVisible(false);
            } catch (Exception ee) {
                System.out.println("Course add failed" + ee);
            }
        } else if (ai.getSource() == b2) {
            frame.setVisible(false);
            new SystemProject().setVisible(true);

        }
    }

    public static void main(String[] arg) {
        new AddStudentCourse().frame.setVisible(true);
    }
}