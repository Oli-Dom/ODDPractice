public class Person {
    private String name;
    private int age;
    private String address;
    private CreditCard creditCard;
    private BankAccount bankAccount;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void openCreditCard(long creditLimit, String expirationDate) {
        CreditCard newCard = new CreditCard(creditLimit, this.name, expirationDate, this.address);
        this.creditCard = newCard;
    }

    public void openBankAccount() {
        BankAccount newAccount = new BankAccount(this.name);
        this.bankAccount = newAccount;
    }
}