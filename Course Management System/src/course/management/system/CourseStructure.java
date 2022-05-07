package course.management.system;

import javax.swing.*;
import java.awt.*;

public class CourseStructure extends JFrame {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l10, l11, l12, l13, l14, l15, l16, l17;
    JLabel lb;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8;
    JLabel lbb1, lbb2, lbb3, lbb4, lbb5, lbb6, lbb7, lbb8, lbb9, lbb10, lbb11, lbb12, lbb13, lbb14, lbb15, lbb16, lbb17,
            lbb18;
    JLabel lm1, lm2, lm3, lm4, lm5, lm6, lm7, lm8, lm9, lm10, lm11, lm12;

    public CourseStructure() {

        setSize(1366, 764);
        setLocation(100, 100);
        setLayout(null);

        lb = new JLabel("Course Structure");
        lb.setFont(new Font("Arial", Font.BOLD, 56));
        lb.setBounds(580, 10, 380, 70);
        add(lb);

        l1 = new JLabel("Course");
        l1.setBounds(80, 100, 100, 40);
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        add(l1);

        l2 = new JLabel("Hari Shrestha");
        l2.setBounds(280, 100, 100, 40);
        l2.setFont(new Font("Arial", Font.BOLD, 16));
        add(l2);

        l3 = new JLabel("Rabin Chettry");
        l3.setBounds(480, 100, 100, 40);
        l3.setFont(new Font("Arial", Font.BOLD, 16));
        add(l3);

        l4 = new JLabel("Rabina Dahal");
        l4.setBounds(680, 100, 100, 40);
        l4.setFont(new Font("Arial", Font.BOLD, 16));
        add(l4);

        lbb5 = new JLabel("Java");
        lbb5.setBounds(680, 170, 150, 40);
        lbb5.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb5);

        lbb6 = new JLabel("Java");
        lbb6.setBounds(680, 240, 150, 40);
        lbb6.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb6);

        lbb7 = new JLabel("Java");
        lbb7.setBounds(680, 310, 150, 40);
        lbb7.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb7);

        lbb8 = new JLabel("Java");
        lbb8.setBounds(680, 380, 150, 40);
        lbb8.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb8);

        lbb13 = new JLabel("Java");
        lbb13.setBounds(680, 450, 150, 40);
        lbb13.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb13);

        lbb14 = new JLabel("Java");
        lbb14.setBounds(680, 520, 150, 40);
        lbb14.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb14);

        l5 = new JLabel("Rabi shah");
        l5.setBounds(880, 100, 100, 40);
        l5.setFont(new Font("Arial", Font.BOLD, 16));
        add(l5);

        lbb9 = new JLabel("Web Development");
        lbb9.setBounds(880, 170, 150, 40);
        lbb9.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb9);

        lbb10 = new JLabel("Web Development");
        lbb10.setBounds(880, 240, 150, 40);
        lbb10.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb10);

        lbb11 = new JLabel("Web Development");
        lbb11.setBounds(880, 310, 150, 40);
        lbb11.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb11);

        lbb12 = new JLabel("Web Development");
        lbb12.setBounds(880, 380, 150, 40);
        lbb12.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb12);

        lbb15 = new JLabel("Web Development");
        lbb15.setBounds(880, 450, 150, 40);
        lbb15.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb15);

        lbb16 = new JLabel("Web Development");
        lbb16.setBounds(880, 520, 150, 40);
        lbb16.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb16);

        l6 = new JLabel("Ram yadhav");
        l6.setBounds(1080, 100, 100, 40);
        l6.setFont(new Font("Arial", Font.BOLD, 16));
        add(l6);

        lm1 = new JLabel("Data Structure");
        lm1.setBounds(1080, 170, 150, 40);
        lm1.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm1);

        lm2 = new JLabel("Data Structure");
        lm2.setBounds(1080, 240, 150, 40);
        lm2.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm2);

        lm3 = new JLabel("Data Structure");
        lm3.setBounds(1080, 310, 150, 40);
        lm3.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm3);

        lm4 = new JLabel("Data Structure");
        lm4.setBounds(1080, 380, 150, 40);
        lm4.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm4);

        l7 = new JLabel("Monica Tamang");
        l7.setBounds(1280, 100, 100, 40);
        l7.setFont(new Font("Arial", Font.BOLD, 16));
        add(l7);

        lm5 = new JLabel("C Programming");
        lm5.setBounds(1280, 170, 150, 40);
        lm5.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm5);

        lm6 = new JLabel("C Programming");
        lm6.setBounds(1280, 240, 150, 40);
        lm6.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm6);

        lm7 = new JLabel("C Programming");
        lm7.setBounds(1280, 310, 150, 40);
        lm7.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm7);

        lm8 = new JLabel("C Programming");
        lm8.setBounds(1280, 380, 150, 40);
        lm8.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm8);

        l8 = new JLabel("Manish Dangol");
        l8.setBounds(1480, 100, 100, 40);
        l8.setFont(new Font("Arial", Font.BOLD, 16));
        add(l8);

        lm9 = new JLabel("Android Stdio");
        lm9.setBounds(1480, 170, 150, 40);
        lm9.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm9);

        lm10 = new JLabel("Android Stdio");
        lm10.setBounds(1480, 240, 150, 40);
        lm10.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm10);

        lm11 = new JLabel("Android Stdio");
        lm11.setBounds(1480, 310, 150, 40);
        lm11.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm11);

        lm12 = new JLabel("Android Stdio");
        lm12.setBounds(1480, 380, 150, 40);
        lm12.setFont(new Font("Arial", Font.BOLD, 16));
        add(lm12);

        l10 = new JLabel("Semester 1");
        l10.setBounds(80, 170, 150, 40);
        l10.setFont(new Font("Arial", Font.BOLD, 16));
        add(l10);

        l11 = new JLabel("Semester 2");
        l11.setBounds(80, 240, 150, 40);
        l11.setFont(new Font("Arial", Font.BOLD, 16));
        add(l11);

        l12 = new JLabel("Semester 3");
        l12.setBounds(80, 310, 150, 40);
        l12.setFont(new Font("Arial", Font.BOLD, 16));
        add(l12);

        l13 = new JLabel("Semester 4");
        l13.setBounds(80, 380, 150, 40);
        l13.setFont(new Font("Arial", Font.BOLD, 16));
        add(l13);

        l14 = new JLabel("Semester 5");
        l14.setBounds(80, 450, 150, 40);
        l14.setFont(new Font("Arial", Font.BOLD, 16));
        add(l14);

        l15 = new JLabel("Semester 6");
        l15.setBounds(80, 520, 150, 40);
        l15.setFont(new Font("Arial", Font.BOLD, 16));
        add(l15);

        l16 = new JLabel("Semester 7");
        l16.setBounds(80, 590, 150, 40);
        l16.setFont(new Font("Arial", Font.BOLD, 16));
        add(l16);

        l17 = new JLabel("Semester 8");
        l17.setBounds(80, 660, 150, 40);
        l17.setFont(new Font("Arial", Font.BOLD, 16));
        add(l17);

        lb1 = new JLabel("Database");
        lb1.setBounds(280, 170, 100, 40);
        lb1.setFont(new Font("Arial", Font.BOLD, 16));
        add(lb1);

        lb2 = new JLabel("Database");
        lb2.setBounds(280, 240, 100, 40);
        lb2.setFont(new Font("Arial", Font.BOLD, 16));
        add(lb2);

        lb3 = new JLabel("Database");
        lb3.setBounds(280, 310, 100, 40);
        lb3.setFont(new Font("Arial", Font.BOLD, 16));
        add(lb3);

        lb4 = new JLabel("Database");
        lb4.setBounds(280, 380, 100, 40);
        lb4.setFont(new Font("Arial", Font.BOLD, 16));
        add(lb4);

        lb5 = new JLabel("Database");
        lb5.setBounds(280, 450, 100, 40);
        lb5.setFont(new Font("Arial", Font.BOLD, 16));
        add(lb5);

        lb6 = new JLabel("Database");
        lb6.setBounds(280, 520, 100, 40);
        lb6.setFont(new Font("Arial", Font.BOLD, 16));
        add(lb6);

        lb7 = new JLabel("Database");
        lb7.setBounds(280, 590, 100, 40);
        lb7.setFont(new Font("Arial", Font.BOLD, 16));
        add(lb7);

        lb8 = new JLabel("Database");
        lb8.setBounds(280, 660, 100, 40);
        lb8.setFont(new Font("Arial", Font.BOLD, 16));
        add(lb8);

        lbb1 = new JLabel("Software development");
        lbb1.setBounds(480, 170, 100, 40);
        lbb1.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb1);

        lbb2 = new JLabel("Software development");
        lbb2.setBounds(480, 240, 100, 40);
        lbb2.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb2);

        lbb3 = new JLabel("Software development");
        lbb3.setBounds(480, 310, 100, 40);
        lbb3.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb3);

        lbb4 = new JLabel("Software development");
        lbb4.setBounds(480, 380, 100, 40);
        lbb4.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb4);

        lbb17 = new JLabel("Software development");
        lbb17.setBounds(480, 450, 100, 40);
        lbb17.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb17);

        lbb18 = new JLabel("Software development");
        lbb18.setBounds(480, 520, 100, 40);
        lbb18.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbb18);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CourseStructure().setVisible(true);
    }
}
