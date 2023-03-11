package Lesson3;


public class Bank {
    private String bankName;
    private String bankKode;
    private Double moneyAmount;
    public static int amountOfAccounts = 0;


    public void getMoneyAmountInfo() {

        System.out.println("Total amount of money in " + this.bankName + " is " + this.moneyAmount);

    }

    public static void getTotalAmountOfClients(BankClient bankClient) {

        System.out.println("Total account : " + amountOfAccounts);
    }

    public void removeAccount(Account account) {
        if (account.getAccountBalance() < 0) {
            System.out.println("Account can not be removed.The client have a credir");
        }
        amountOfAccounts--;
        moneyAmount = moneyAmount - account.getAccountBalance();
        System.out.println("Account " + account.getAccountNumber() + " was removed successfully !");
    }


    public void addAccount(Account account) {
        if (account.getAccountBalance() < 0) {
            System.out.println("Account be removed.The client don't have a credit");
        }
        amountOfAccounts++;
        moneyAmount = moneyAmount + account.getAccountBalance();
        System.out.println("Account  added " + account.accountNumber);
    }

    public Bank(String bankName, String bankKode) {
        this.bankName = bankName;
        this.bankKode = bankKode;


    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankKode() {
        return bankKode;
    }

    public void setBankKode(String bankKode) {
        this.bankKode = bankKode;
    }


    public static int getAmountOfAccounts() {
        return amountOfAccounts;
    }

    public static void setAmountOfAccounts(int amountOfAccounts) {
        Bank.amountOfAccounts = amountOfAccounts;
    }

    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "Bank{" + "bankName='" + bankName + '\'' + ", bankKode='" + bankKode + '\'' + ", moneyAmount=" + moneyAmount + '}';
    }
}




