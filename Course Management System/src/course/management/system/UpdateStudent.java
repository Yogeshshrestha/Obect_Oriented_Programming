package course.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class UpdateStudent implements ActionListener {

    JFrame f1;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
    JButton btn, btn1, btn2;

    UpdateStudent() {
        f1 = new JFrame("StudentUpdatePanel");
        f1.setSize(960, 660);
        f1.setLocation(200, 40);
        f1.setBackground(Color.white);
        f1.setLayout(null);

        JLabel l1 = new JLabel("Enter Student id to update the data of student");
        l1.setBounds(50, 100, 500, 30);
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        f1.add(l1);

        tf7 = new JTextField();
        tf7.setBounds(500, 100, 200, 30);
        f1.add(tf7);

        btn2 = new JButton("Update");
        btn2.setBounds(720, 100, 100, 30);
        f1.add(btn2);
        btn2.addActionListener(this);

        lb5 = new JLabel("Update the Student Detail");
        lb5.setBounds(50, 10, 500, 50);
        lb5.setFont(new Font("Arial", Font.BOLD, 36));
        lb5.setForeground(Color.black);
        f1.add(lb5);

        lb1 = new JLabel("Student name");
        lb1.setBounds(50, 170, 100, 30);
        lb1.setFont(new Font("Arial", Font.BOLD, 18));
        f1.add(lb1);

        tf1 = new JTextField();
        tf1.setBounds(200, 170, 150, 30);
        f1.add(tf1);

        lb2 = new JLabel("Course Id");
        lb2.setBounds(50, 220, 100, 30);
        lb2.setFont(new Font("Arial", Font.BOLD, 18));
        f1.add(lb2);

        tf2 = new JTextField();
        tf2.setBounds(200, 220, 150, 30);
        f1.add(tf2);

        lb3 = new JLabel("Course");
        lb3.setBounds(50, 270, 100, 30);
        lb3.setFont(new Font("Arial", Font.BOLD, 18));
        f1.add(lb3);

        tf3 = new JTextField();
        tf3.setBounds(200, 270, 150, 30);
        f1.add(tf3);

        lb4 = new JLabel("Faculty");
        lb4.setBounds(50, 320, 100, 30);
        lb4.setFont(new Font("Arial", Font.BOLD, 18));
        f1.add(lb4);

        tf4 = new JTextField();
        tf4.setBounds(200, 320, 150, 30);
        f1.add(tf4);

        lb6 = new JLabel("Semister");
        lb6.setBounds(50, 370, 130, 30);
        lb6.setFont(new Font("Arial", Font.BOLD, 18));
        f1.add(lb6);

        tf5 = new JTextField();
        tf5.setBounds(200, 370, 150, 30);
        f1.add(tf5);

        lb7 = new JLabel("Module");
        lb7.setBounds(50, 420, 150, 30);
        lb7.setFont(new Font("Arial", Font.BOLD, 18));
        f1.add(lb7);

        tf6 = new JTextField();
        tf6.setBounds(200, 420, 150, 30);
        f1.add(tf6);

        btn = new JButton("Update");
        btn.setBounds(250, 520, 150, 36);

        f1.add(btn);

        btn1 = new JButton("Cancel");
        btn1.setBounds(450, 520, 150, 36);

        f1.add(btn1);

        btn.addActionListener(this);
        btn1.addActionListener(this);

        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn) {
            try {
                Connections c1 = new Connections();
                String str = "update student_course set student_Name='" + tf1.getText() + "',course_id='" + tf2.getText()
                        + "',course='" + tf3.getText() + "',faculty='" + tf4.getText() + "',semisters='" + tf5.getText()
                        + "',model='" + tf6.getText() + "'";
                c1.st.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "successfully updated");
                f1.setVisible(false);
                new CourseDetails();
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
        if (ae.getSource() == btn1) {
            f1.setVisible(false);
            new SystemProject().setVisible(true);
        }
        if (ae.getSource() == btn2) {
            try {
                Connections con = new Connections();
                String str = "select * from student where student_Id = '" + tf7.getText() + "'";
                ResultSet rs = con.st.executeQuery(str);

                if (rs.next()) {
                    f1.setVisible(true);

                    tf1.setText(rs.getString(1));
                    tf2.setText(rs.getString(3));
                    tf3.setText(rs.getString(5));
                    tf4.setText(rs.getString(7));
                    tf5.setText(rs.getString(9));
                    tf6.setText(rs.getString(11));
                }

            } catch (Exception ex) {
            }

            f1.setVisible(true);
            f1.setSize(900, 650);
            f1.setLocation(250, 250);
        }
    }

    public static void main(String[] arg) {
        new UpdateStudent().f1.setVisible(true);
    }
}