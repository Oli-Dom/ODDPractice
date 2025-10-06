public class BankAccountOpener implements Opener<BankAccount> {
    @Override
    public BankAccount open(Person person) {
        // Use person's name to open the account
        return new BankAccount(person.getName());
    }

}
