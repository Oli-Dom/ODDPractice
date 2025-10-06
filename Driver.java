public class Driver {
    public static void main(String[] args) {
        Person Oliver = new Person("Oliver", 21, "123 Main St");

        Oliver.openBankAccount();
        Oliver.getBankAccount().deposit(1000);
        Oliver.getBankAccount().getAccountInfo();
        Oliver.openCreditCard(2000, "12/25");
        Oliver.getCreditCard().getCardInfo();
    }
}
