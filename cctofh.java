import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class cctofh implements ActionListener {
    private JButton b1;
    private JFrame f1;
    private JLabel l1, l3;
    private JTextField t1, t2;
    private JPanel p1, p2;
    // private JCheckBox ck1, ck2;

    /**
     * 
     */
    public void eiei() {
        f1 = new JFrame();
        f1.setLayout(new GridLayout(2, 1));
        b1 = new JButton("Celsius");
        t1 = new JTextField("°F", 20);
        t2 = new JTextField("result", 20);
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel("input your Fahrenheit ");
        // l2 = new JLabel("ANS");
        l3 = new JLabel("");

        l1.setFont(new Font(null, 0, 25));

        t1.setPreferredSize(new Dimension(30, 30));
        t2.setPreferredSize(new Dimension(30, 30));
        b1.setPreferredSize(new Dimension(110, 25));

        // JCheckBox ck1 = new JCheckBox("Fahrenheit");
        // ck1.setBounds(100, 100, 50, 50);
        // JCheckBox ck2 = new JCheckBox("Celsius");
        // ck2.setBounds(100, 100, 50, 50);

        p1.setBackground(Color.pink);
        p2.setBackground(Color.CYAN);
        t2.setForeground(Color.gray);
        t1.setForeground(Color.gray);

        b1.addActionListener(this);

        // p2.add(l2);
        p2.add(t2);
        p2.add(l3);

        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        // p1.add(ck1);
        // p1.add(ck2);

        f1.add(p1);
        f1.add(p2);
        f1.setTitle("Convert");
        // f1.pack();

        f1.setSize(275, 275);
        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        double value = Double.parseDouble(t1.getText());
        if (cmd == "Celsius") {

            String output = String.valueOf((value - 32) / 1.8);

            t2.setForeground(Color.BLACK);
            t2.setText(output);
            b1.setText("Fahrenheit");
            l1.setText("input you Celsius ");
            l3.setFont(new Font(null, 0, 30));
            l3.setText("°C");

        }
        if (cmd == "Fahrenheit") {

            String output = String.valueOf((value * 1.8) + 32);

            t2.setText(output);
            b1.setText("Celsius");
            l1.setText("input you Fahrenheit ");
            l3.setText("°F");

        }
    }

    public static void main(String[] args) {
        cctofh cc1 = new cctofh();
        cc1.eiei();
    }
}