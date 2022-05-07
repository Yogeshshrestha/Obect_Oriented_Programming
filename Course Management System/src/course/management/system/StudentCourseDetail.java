package course.management.system;

import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentCourseDetail extends JFrame implements ActionListener {

    JTable t1;
    JButton btn1;
    String s1[] = { "Student Id", "Semisters", "Course", "Faculty" };
    String s2[][] = new String[15][4];
    int c = 0, d = 0;

    StudentCourseDetail() {
        super("View Students Course");
        setSize(780, 280);
        setLocation(250, 150);

        try {
            String s3 = "select * from student_Course";
            Connections c1 = new Connections();
            ResultSet rs = c1.st.executeQuery(s3);
            while (rs.next()) {
                s2[c][d++] = rs.getString("Student_id");
                s2[c][d++] = rs.getString("Semisters");
                s2[c][d++] = rs.getString("Course");
                s2[c][d++] = rs.getString("Faculty");
                c++;
                d = 0;
            }

            t1 = new JTable(s2, s1);

        } catch (Exception e) {
        }

        btn1 = new JButton("Print");
        add(btn1, "South");
        JScrollPane s1 = new JScrollPane(t1);
        add(s1);

        btn1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ai) {
        try {
            t1.print();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new StudentCourseDetail().setVisible(true);
    }
}