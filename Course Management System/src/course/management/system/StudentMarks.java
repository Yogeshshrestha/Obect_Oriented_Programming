/*
 * To change this license header, choose License Headers in SystemProject Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class StudentMarks extends JFrame {

    JTextArea ta1;
    JPanel pa1;

    StudentMarks() {
    }

    StudentMarks(String str) {
        setSize(500, 600);
        setLayout(new BorderLayout());

        pa1 = new JPanel();

        ta1 = new JTextArea(50, 15);
        JScrollPane jsp = new JScrollPane(ta1);
        ta1.setFont(new Font("Arial", Font.BOLD, 18));

        add(pa1, "North");

        add(jsp, "Center");

        setLocation(450, 200);
        mark(str);
    }

    public void mark(String s) {
        try {
            Connections c1 = new Connections();

            ta1.setText("\tResult of Examination\n\nCourse\n");

            ResultSet rs1 = c1.st.executeQuery("select * from course where student_Id=" + s);

            if (rs1.next()) {
                ta1.append("\n\t" + rs1.getString("course"));
                ta1.append("\n\t" + rs1.getString("course2"));
                ta1.append("\n\t" + rs1.getString("course3"));
                ta1.append("\n\t" + rs1.getString("course4"));
                ta1.append("\n\t" + rs1.getString("course5"));
                ta1.append("\n-----------------------------------------");
                ta1.append("\n");
            }

            ResultSet rs2 = c1.st.executeQuery("select * from marks where student_ID=" + s);

            if (rs2.next()) {
                ta1.append("\nStudentMarks\n\n\t" + rs2.getString("marks1"));
                ta1.append("\n\t" + rs2.getString("marks2"));
                ta1.append("\n\t" + rs2.getString("marks3"));
                ta1.append("\n\t" + rs2.getString("marks4"));
                ta1.append("\n\t" + rs2.getString("marks5"));
                ta1.append("\n-----------------------------------------");
                ta1.append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new StudentMarks().setVisible(true);
    }
}