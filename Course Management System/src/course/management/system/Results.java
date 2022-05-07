package course.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
//import net.proteanit.sql.DbUtils;

public class Results extends JFrame implements ActionListener {

    private JPanel p;
    private JTable t;
    private JTextField tf;
    private JButton btn1;

    public void Result() {
        try {
            Connections c1 = new Connections();
            String s1 = "select * from student";
            PreparedStatement st = c1.cn.prepareStatement(s1);
            ResultSet rs1 = st.executeQuery();

            // t.setModel(DbUtils.resultSetToTableModel(rs1));
            rs1.close();
            st.close();
            c1.cn.close();
        } catch (Exception e) {
        }

    }

    public Results() {

        setBounds(350, 200, 900, 500);
        p = new JPanel();
        p.setBackground(Color.WHITE);
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(p);
        p.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(80, 132, 1078, 281);
        p.add(scrollPane);

        t = new JTable();
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = t.getSelectedRow();
                tf.setText(t.getModel().getValueAt(row, 10).toString());
            }
        });

        t.setFont(new Font("Arial", Font.BOLD, 16));
        scrollPane.setViewportView(t);

        btn1 = new JButton("Result");
        btn1.addActionListener(this);
        btn1.setFont(new Font("Arial", Font.BOLD, 18));
        btn1.setBounds(564, 89, 138, 33);
        p.add(btn1);

        JLabel l1 = new JLabel("Show Result");
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setBounds(300, 15, 400, 47);
        p.add(l1);

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 17));
        tf.setBounds(189, 89, 357, 33);
        p.add(tf);
        tf.setColumns(10);

        JLabel l2 = new JLabel("Back");
        l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setBounds(98, 90, 73, 34);
        p.add(l2);

        JPanel p1 = new JPanel();
        p1.setBounds(68, 55, 1100, 369);
        p.add(p1);
        Result();
        setSize(1200, 550);
    }

    public void actionPerformed(ActionEvent ai) {
        try {
            if (ai.getSource() == btn1) {
                new StudentMarks(tf.getText()).setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new Results().setVisible(true);
    }
}