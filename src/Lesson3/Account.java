package Lesson3;

public class Account {
    public String accountNumber;
    public Double accountBalance;
    BankClient bankClient;
    Bank bank;


    public Account(String accountNumber, double accountBalance, Bank bank, BankClient bankClient) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.bank = bank;
        this.bankClient = bankClient;

    }

    public Account() {
    }


    public void withdraw(double amount) {
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BankClient getBankClient() {
        return bankClient;
    }

    public void setBankClient(BankClient bankClient) {
        this.bankClient = bankClient;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", bankClient=" + bankClient +
                ", bank=" + bank +
                '}';
    }
}


