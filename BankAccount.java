public class BankAccount {
    private long balance;
    private String owner;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public long getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public void deposit(long depositAmt) {
        if (depositAmt < 0) {
            System.out.println("The balance cannot be negative!");
        } else {
            this.balance += depositAmt;
        }
    }

    public void withdraw(long withdrawAmt) {
        if (withdrawAmt > this.balance) {
            System.out.println("Not enough funds in the acccount");
        } else {
            this.balance -= withdrawAmt;
            System.out.println(String.format("Withdraw successful, your new balance is %d", this.balance));
        }
    }

    public void getAccountInfo() {
        System.out.println(String.format("Hello %s, your balance is %d", this.owner, this.balance));
    }
}