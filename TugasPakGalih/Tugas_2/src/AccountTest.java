public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(500.00, "Wira Yudha Aji Pratama");
        SavingBonds bonds = new SavingBonds();

        System.out.println("Account Holder: " + account.getName());
        System.out.println("Initial Balance: $" + account.getBalance() + "\n");

        account.withdraw(400); //should be okay
        account.withdraw(-200); //should be shown warning
        account.withdraw(7000); //should be shown warning
        account.addBalance(1000);

        bonds.showInterest(1000, 2, account.getBalance());
    }
}

