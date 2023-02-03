import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class cctofh implements ActionListener {
    private JButton b1;
    private JFrame f1;
    private JLabel l1, l3;
    private JTextField t1, t2;
    private JPanel p1, p2;

    public void eiei() {
        f1 = new JFrame();
        b1 = new JButton("Celsius");
        t2 = new JTextField("result", 10);
        p1 = new JPanel();
        f1.setLayout(new GridLayout(2, 1));
        p2 = new JPanel();
        // p3 = new JPanel();
        l1 = new JLabel("input you Fahrenheit ");
        t1 = new JTextField(10);
        l3 = new JLabel("");
        t1.setSize(50, 50);
        p1.setBackground(Color.pink);
        p2.setBackground(Color.black);
        b1.addActionListener(this);
        t1.setPreferredSize(new Dimension(50, 50));

        p1.add(l3);
        p2.add(t2);
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        f1.add(p1);
        f1.add(p2);

        f1.setSize(500, 300);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        cctofh cc1 = new cctofh();
        cc1.eiei();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        double value = Double.parseDouble(t1.getText());
        if (cmd == "Celsius") {

            String output = String.valueOf((value - 32) / 1.8);
            t2.setText(output);
            b1.setText("Fahrenheit");
            l1.setText("input you Celsius ");
        }
        if (cmd == "Fahrenheit") {
            String output = String.valueOf((value * 1.8) + 32);
            t2.setText(output);
            b1.setText("Celsius");
            l1.setText("input you Fahrenheit ");
        }
    }

}