public class teller {
    public static void main(String[] args) {
        Customer cust = new Customer("Sommai", "Summut");
        Account ac = new SavingAccount(5000);
        cust.addAccount(ac);
        var tl = new TellerGUI(cust);
        tl.init();
    }
}
