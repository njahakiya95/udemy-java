public class Main {
    public static void main(String[] args) {

        BankAccount NirmsAccount = new BankAccount("12345", 0.00, "Nirmal Patel", "Nirmal@gmail.com",
                "1112223333");

        NirmsAccount.withdrawal(100.0);

        NirmsAccount.deposit(50.0);
        NirmsAccount.withdrawal(100.0);

        NirmsAccount.deposit(51.0);
        NirmsAccount.withdrawal(100.0);
    }
}
