package Lesson3;

public class DebitAccount extends Account {
    public DebitAccount() {
    }

    public DebitAccount(String accountNumber, double accountBalance, Bank bank, BankClient bankClient) {
        super(accountNumber, accountBalance, bank, bankClient);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        System.out.println("You will get money without any commission: " + amount);
    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                "accountBalance=" + accountBalance +
                "} " + super.toString();
    }
}



