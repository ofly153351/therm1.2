import java.awt.*;
import javax.swing.*;

public class TellerGUISwing {
    private JButton bn1, bn2, bn3;
    private JTextField tf1, tf2, tf3;
    private JLabel l1, l2, l3;
    private JTextField err;
    private JPanel p1, p2, p3;
    private JFrame fr;
    private Customer cust;

    /**
     * 
     */
    public void init() {
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        err = new JTextField();

        l1 = new JLabel("Name:");
        l2 = new JLabel("Balacne:");
        l3 = new JLabel("Amount:");

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));

        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);

        p2.add(bn1);
        p2.add(bn2);
        p2.add(bn3);

        p3.setLayout(new BorderLayout());
        p3.add(p1, BorderLayout.CENTER);
        p3.add(p2, BorderLayout.SOUTH);

        fr = new JFrame("Bank");

        fr.getContentPane().add(p3, BorderLayout.CENTER);
        fr.getContentPane().add(err, BorderLayout.SOUTH);

        tf1.setEditable(false);
        tf2.setEditable(false);
        err.setEditable(false);

        tf2.setText(cust.getAccount(0).getBalance() + "");
        tf1.setText(cust.getFirstName() + " " + cust.getLastName());

        tf1.setBackground(new Color(123, 104, 238));
        tf2.setBackground(new Color(123, 104, 238));
        tf3.setBackground(new Color(123, 104, 238));

        bn1.setBackground(new Color(123, 104, 238));
        bn2.setBackground(new Color(123, 104, 238));
        bn3.setBackground(new Color(123, 104, 238));

        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);

        tf1.setForeground(Color.WHITE);
        tf2.setForeground(Color.WHITE);
        tf3.setForeground(Color.WHITE);

        bn1.setForeground(Color.WHITE);
        bn2.setForeground(Color.WHITE);
        bn3.setForeground(Color.WHITE);

        p1.setBackground(new Color(72, 61, 139));
        p2.setBackground(new Color(72, 61, 139));
        p2.setBackground(new Color(72, 61, 139));
        err.setBackground(new Color(72, 61, 139));

        fr.pack();
        fr.show();
        // bn3.addActionListener((event) -> System.exit(0));
        // fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public TellerGUISwing(Customer c) {
        cust = c;
    }

    public static void main(String[] args) {
        Customer cust = new Customer("peerapat", "klintan");
        Account ac = new SavingAccount(5000);
        cust.addAccount(ac);
        TellerGUISwing tl = new TellerGUISwing(cust);
        tl.init();
    }

}
