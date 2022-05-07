package course.management.system;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentCourse extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JButton btn1, btn2;
    Choice c1, c2, c3, c4;

    StudentCourse() {

        setLayout(new GridLayout(5, 2, 45, 45));
        c1 = new Choice();
        try {
            Connections c = new Connections();
            ResultSet rs = c.st.executeQuery("select * from student");
            while (rs.next()) {
                c1.add(rs.getString("student_id"));
            }

        } catch (Exception e) {
        }

        add(new JLabel("Select Student Id"));
        add(c1);

        l1 = new JLabel("semister");
        c2 = new Choice();
        c2.add("1");
        c2.add("2");
        c2.add("3");
        c2.add("4");
        c2.add("5");
        c2.add("6");
        c2.add("7");
        c2.add("8");

        add(l1);
        add(c2);

        l2 = new JLabel("Course");
        c3 = new Choice();
        c3.add("Database");
        c3.add("Java");
        c3.add("C Programming");
        c3.add("PHP");
        c3.add("Android Stdio");
        c3.add("DJango");
        c3.add("Personnal development");

        add(l2);
        add(c3);

        l3 = new JLabel("Faculty");
        c4 = new Choice();
        c4.add("BBA");
        c4.add("BBS");
        c4.add("BIM");
        c4.add("BSCSIT");
        c4.add("BIT");

        add(l3);
        add(c4);

        btn1 = new JButton("Enroll");

        btn2 = new JButton("Cancel");

        add(btn1);
        add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setVisible(true);
        setSize(420, 420);
        setLocation(400, 200);

    }

    public void actionPerformed(ActionEvent ai) {

        String s1 = c2.getSelectedItem();
        String s2 = c3.getSelectedItem();
        String s4 = c1.getSelectedItem();
        String s6 = c4.getSelectedItem();
        String s5 = "insert into student_Course values(" + s4 + ",'" + s1 + "','" + s2 + "','" + s6 + "')";

        try {
            Connections c1 = new Connections();
            c1.st.executeUpdate(s5);
            JOptionPane.showMessageDialog(null, "Course Enrolled");
            this.setVisible(false);
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public static void main(String s2[]) {
        new StudentCourse();
    }
}
