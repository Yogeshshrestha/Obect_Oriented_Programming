package course.management.system;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
       creating login Panel
 */

public class LoginPanel extends JFrame implements ActionListener {

    JLabel label1, label2;
    JTextField txtf1;
    JPasswordField txtp1;
    JButton btn1, btn2;

    LoginPanel() {

        super("LoginPanel");

        setBackground(Color.white);
        setLayout(null);

        label1 = new JLabel("Username");
        label1.setBounds(35, 25, 90, 40);
        add(label1);

        label2 = new JLabel("Password");
        label2.setBounds(35, 65, 90, 40);
        add(label2);

        txtf1 = new JTextField();
        txtf1.setBounds(140, 25, 145, 40);
        add(txtf1);

        txtp1 = new JPasswordField();
        txtp1.setBounds(140, 65, 145, 40);
        add(txtp1);

        btn1 = new JButton("Login");
        btn1.setBounds(35, 135, 115, 40);
        btn1.setFont(new Font("arial", Font.BOLD, 20));
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("Cancel");
        btn2.setBounds(175, 135, 115, 40);
        btn2.setFont(new Font("serif", Font.BOLD, 20));
        add(btn2);

        btn2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(400, 250);
        setLocation(400, 250);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn1) {
            try {
                Connections c1 = new Connections(); // creating c1 object of class conn
                String s1 = txtf1.getText();
                String s2 = txtp1.getText();

                String s3 = "select * from loginPanel where username='" + s1 + "' and password='" + s2 + "'"; // assigning location to table named loginpanel

                ResultSet r1 = c1.st.executeQuery(s3); // using result to store output data
                if (r1.next()) {                  // using r1.next to jump row to row
                    new SystemProject().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "login Failed"); // if incorrect password or username is entered
                }
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == btn2) { // cancel button
            System.exit(0);
        }
    }

    public static void main(String[] arg) {
        new LoginPanel();
    }
}