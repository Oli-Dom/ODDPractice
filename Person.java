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

    public String getAddress() {
        return this.address;
    }

    public void openCreditCard(long creditLimit) {
        CreditCard newCard = new CreditCardOpener().open(this);
        this.creditCard = newCard;
    }

    public void openBankAccount() {
        BankAccount newAccount = new BankAccountOpener().open(this);
        this.bankAccount = newAccount;
    }
}