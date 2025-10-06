public class CreditCardOpener implements Opener<CreditCard> {
    
    @Override
    public CreditCard open(Person person) {
        // Use person's name and default values to open the credit card
        return new CreditCard(1000, person.getName(), person.getAddress());
    }
}
