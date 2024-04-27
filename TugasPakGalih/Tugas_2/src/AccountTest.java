public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(500.00, "Wira Yudha Aji Pratama");
        SavingBonds bonds = new SavingBonds(20, 100, account.getBalance());

        System.out.println("Account Holder: " + account.getName());
        System.out.println("Initial Balance: $" + account.getBalance());

        account.withdraw(400);
        account.withdraw(-200);
        account.withdraw(7000);
        account.addBalance(1000);

        bonds.showInterest();
    }
}

