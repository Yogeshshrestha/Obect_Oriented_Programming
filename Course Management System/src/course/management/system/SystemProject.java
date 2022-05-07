package course.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SystemProject extends JFrame implements ActionListener {
    SystemProject() {
        super("Course Management System");

        setSize(1366, 764);

        JMenuBar mb1 = new JMenuBar();
        JMenu Ca = new JMenu("Course Administrator");
        JMenuItem mi = new JMenuItem("Add Course");
        JMenuItem mi1 = new JMenuItem("Course Details");
        JMenuItem mi2 = new JMenuItem("Enter StudentMarks");
        Ca.setForeground(Color.BLUE);

        mi.setFont(new Font("Arial", Font.BOLD, 18));
        mi.setBackground(Color.WHITE);

        mi.addActionListener(this);

        mi1.setFont(new Font("Arial", Font.BOLD, 18));
        mi1.setBackground(Color.WHITE);

        mi1.addActionListener(this);

        JMenu student = new JMenu("Student");
        JMenuItem mi3 = new JMenuItem("Course Structure");
        JMenuItem mi4 = new JMenuItem("Course enroll");
        JMenuItem mi5 = new JMenuItem("Course enrolled Detail");

        student.setForeground(Color.BLUE);

        mi4.setFont(new Font("Arial", Font.BOLD, 18));
        mi4.setBackground(Color.WHITE);
        student.add(mi4);

        mi4.addActionListener(this);

        mi5.setFont(new Font("Arial", Font.BOLD, 18));
        mi5.setBackground(Color.WHITE);

        mi5.addActionListener(this);

        JMenu instructor = new JMenu("Instructor");
        JMenuItem mi6 = new JMenuItem("Result Details");
        JMenuItem mi7 = new JMenuItem("Update Students");
        instructor.setForeground(Color.BLUE);

        mi6.setFont(new Font("Arial", Font.BOLD, 18));
        mi6.setBackground(Color.WHITE);

        mi2.setFont(new Font("Arial", Font.BOLD, 18));
        mi2.setBackground(Color.WHITE);

        mi6.addActionListener(this);
        mi2.addActionListener(this);

        mi7.setFont(new Font("Arial", Font.BOLD, 18));
        mi7.setBackground(Color.WHITE);

        mi7.addActionListener(this);

        mi3.setFont(new Font("Arial", Font.BOLD, 18));
        mi3.setBackground(Color.WHITE);

        mi3.addActionListener(this);

        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);

        ex.setFont(new Font("Arial", Font.BOLD, 18));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);

        Ca.add(mi);
        Ca.add(mi1);
        Ca.add(mi2);

        student.add(mi5);
        student.add(mi3);

        instructor.add(mi7);
        instructor.add(mi6);
        exit.add(ex);

        mb1.add(Ca);
        mb1.add(student);
        mb1.add(instructor);
        mb1.add(exit);

        setJMenuBar(mb1);

        setFont(new Font("Arial", Font.BOLD, 18));
        setLayout(new FlowLayout());
        setVisible(false);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Add Course")) {
            new AddStudentCourse().frame.setVisible(true);

        } else if (msg.equals("Course Details")) {
            new CourseDetails().setVisible(true);

        } else if (msg.equals("Update Students")) {
            new UpdateStudent().f1.setVisible(true);

        }

        else if (msg.equals("Course Structure")) {
            new CourseStructure().setVisible(true);

        } else if (msg.equals("Exit")) {
            System.exit(0);
        } else if (msg.equals("Course enroll")) {
            new StudentCourse().setVisible(true);
        } else if (msg.equals("Course enrolled Detail")) {
            new StudentCourseDetail().setVisible(true);
        } else if (msg.equals("Result Details")) {
            new Results().setVisible(true);
        } else if (msg.equals("Enter StudentMarks")) {
            new MarksInput().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new SystemProject().setVisible(true);
    }

}
