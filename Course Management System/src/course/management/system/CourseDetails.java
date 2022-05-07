package course.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class CourseDetails extends JFrame implements ActionListener {

    JLabel lb1, lb2, lb3;
    JTable t1;
    JButton btn1, btn2, btn3;
    JTextField t2;
    String a[] = { "CourseName", "Module", "CourseId", "Faculty", "Semister" };
    String b[][] = new String[18][13];
    int c = 0, d = 0;

    CourseDetails() {
        super("Course Details");
        setSize(1250, 650);
        setLocation(150, 150);
        setLayout(null);

        lb1 = new JLabel("Enter Course Id to delete Course : ");
        lb1.setBounds(50, 360, 400, 30);
        lb1.setFont(new Font("Arial", Font.BOLD, 18));
        add(lb1);

        t2 = new JTextField();
        t2.setBounds(400, 360, 200, 30);
        add(t2);

        btn1 = new JButton("Delete");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setBounds(620, 360, 100, 30);
        add(btn1);

        lb2 = new JLabel("Add New Course");
        lb2.setBounds(50, 450, 400, 30);
        lb2.setFont(new Font("Arial", Font.BOLD, 18));
        add(lb2);

        btn2 = new JButton("Add");
        btn2.setBounds(300, 450, 150, 30);
        add(btn2);

        lb3 = new JLabel("Update Course Details");
        lb3.setBounds(50, 490, 400, 30);
        lb3.setFont(new Font("Arial", Font.BOLD, 18));
        add(lb3);

        btn3 = new JButton("Update Course");
        btn3.setBounds(300, 490, 150, 30);
        add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        try {
            Connections c1 = new Connections();
            String s1 = "select * from student";
            ResultSet rs = c1.st.executeQuery(s1);
            while (rs.next()) {
                b[c][d++] = rs.getString("CourseName");
                b[c][d++] = rs.getString("Module");
                b[c][d++] = rs.getString("CourseId");
                b[c][d++] = rs.getString("Faculty");
                b[c][d++] = rs.getString("Semister");
                c++;
                d = 0;
            }
            t1 = new JTable(b, a);

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane sp1 = new JScrollPane(t1);
        sp1.setBounds(18, 18, 1200, 330);
        add(sp1);

        getContentPane().setBackground(Color.WHITE);

        btn1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        Connections c1 = new Connections();

        if (ae.getSource() == btn1) {
            try {
                String a = t2.getText();
                String q = "delete from student where student_id = '" + a + "'";
                c1.st.executeUpdate(q);
                this.setVisible(false);
                new CourseDetails().setVisible(true);
            } catch (Exception e) {
            }

        } else if (ae.getSource() == btn2) {
            new AddStudentCourse().frame.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == btn3) {
            // new UpdateStudent().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new CourseDetails().setVisible(true);
    }

}
