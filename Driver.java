public class Driver {
    public static void main(String[] args) {
        Person Oliver = new Person("Oliver", 21, "123 Main St");

        Oliver.openBankAccount();
        Oliver.getBankAccount().deposit(1000);
        Oliver.getBankAccount().getAccountInfo();
        Oliver.openCreditCard(2000);
        Oliver.getCreditCard().getCardInfo();
        System.out.println(Oliver.getCreditCard().processPayment(50000));
        System.out.println(Oliver.getCreditCard().processPayment(100));
        Oliver.getCreditCard().getCardInfo();

    }
}
