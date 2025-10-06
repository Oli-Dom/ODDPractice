import java.util.Random;

public class CreditCard implements PaymentInterface {

    private long creditBalance;
    private long creditLimit;
    private boolean isOverLimit;
    private String cardHolderName;
    private String cardNumber;
    private String expirationDate;
    private String securityCode;
    private String billingAddress;

    Random numberGenerator = new Random();

    public CreditCard(long creditLimit, String cardHolderName, String expirationDate, String billingAddress) {

        if (creditLimit <= 0) {
            this.creditLimit = 500;
        } else {
            this.creditLimit = creditLimit;
        }
        this.cardHolderName = cardHolderName;
        this.cardNumber = String.format("%04d-%04d-%04d-%04d", numberGenerator.nextInt(10000),
                numberGenerator.nextInt(10000), numberGenerator.nextInt(10000), numberGenerator.nextInt(10000));
        this.expirationDate = expirationDate;
        this.securityCode = String.format("%03d", numberGenerator.nextInt(1000));
        this.billingAddress = billingAddress;
    }

    public long getCreditCardBalance() {
        return this.creditBalance;
    }

    public long getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(long newLimit) {
        this.creditLimit = newLimit;
    }

    public void setCreditBalance(long newBalance) {
        this.creditBalance = newBalance;
    }

    public boolean getIsOverLimit() {
        return this.isOverLimit;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public String getSecurityCode() {
        return this.securityCode;
    }

    public String getBillingAddress() {
        return this.billingAddress;
    }

    public void getCardInfo() {
        System.out.println(String.format(
                "Card Holder Name: %s\nCard Number: %s\nExpiration Date: %s\nSecurity Code: %s\nBilling Address: %s\nCredit Limit: $%d\nCredit Balance: $%d \n Over Limit: %b",
                this.cardHolderName, this.cardNumber, this.expirationDate, this.securityCode, this.billingAddress,
                this.creditLimit, this.creditBalance, this.isOverLimit));
    }

    @Override
    public String processPayment(long amount) {
        if (this.creditBalance >= this.creditLimit) {
            this.isOverLimit = true;
            return String.format("You are $%d over your limit, please pay off balance first.",
                    this.creditBalance - this.creditLimit);
        } else {
            this.isOverLimit = false;
            this.creditBalance += amount;
            return String.format("Payment of $%d processed, your new balance is $%d", amount, this.creditBalance);
        }

    }

}
