package Lesson3;

public class CreditAccount extends Account {
    Double accountLimit;

    public CreditAccount() {
    }

    public CreditAccount(String accountNumber, double accountBalance, Bank bank, BankClient bankClient) {
        super(accountNumber, accountBalance, bank, bankClient);
        this.accountLimit = accountLimit;


        if (bankClient.getAge() < 25) {
            this.accountLimit = 100.0;

        }
        this.accountLimit = 10000.0;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Commission of credit account withdraw is 10 percent and\n" +
                "you will get an amount that is less than 10 percent : " + (amount - (amount * 0.2)));
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "accountLimit=" + accountLimit +
                '}';
    }

    public Double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Double accountLimit) {
        this.accountLimit = accountLimit;
    }
}

