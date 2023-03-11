package Lesson3;


public class Main {


    public static void main(String[] args) {
        Bank Mono = new Bank(" MonoBank", " 12");
        Bank Aval = new Bank(" AvalBank", " 7");

        BankClient us1 = new BankClient(1, "Natalia Skoropad", 12, " Natalochka.poltavochka@Gmail.com ", " 063 19 18 644 ", " qwerty1234 ", " Lviv Ukraine ");
        System.out.println(Bank.getAmountOfAccounts());
        Mono.setMoneyAmount(1223.0);
        System.out.println(Mono);
        System.out.println(us1);
        CreditAccount accountCredit = new CreditAccount();
        accountCredit.setAccountNumber(" 1");
        accountCredit.setAccountBalance(500.2);
        Mono.setMoneyAmount(12.2);
        accountCredit.setAccountLimit(20000.0);
        Mono.addAccount(accountCredit);
        System.out.println(accountCredit);
        accountCredit.withdraw(133.1);
        Mono.getMoneyAmountInfo();
        Bank.getTotalAmountOfClients(us1);
        System.out.println();
        System.out.println("---------------------------------------");


        BankClient us2 = new BankClient(2, " Kolos Andriy ", 21, " kolos22@gmail.com ", " 09823226755 ", " 1234 ", " Dnipro Ukraine ");
        System.out.println(Bank.getAmountOfAccounts());
        Aval.setMoneyAmount(22565.0);
        System.out.println(Aval);
        System.out.println(us2);
        CreditAccount accountCredit1 = new CreditAccount();
        accountCredit1.setAccountNumber(" 2 ");
        accountCredit1.setAccountBalance(5450.2);
        Aval.setMoneyAmount(14.2);
        accountCredit1.setAccountLimit(25000.0);
        Aval.addAccount(accountCredit1);
        System.out.println(accountCredit1);
        Aval.getMoneyAmountInfo();
        Aval.getTotalAmountOfClients(us2);
        accountCredit1.withdraw(1332.1);
        Aval.removeAccount(accountCredit1);
        System.out.println();
        System.out.println("---------------------------------------");


        BankClient us3 = new BankClient(3, "Volodumyr Ivashko ", 45, "ivashko@Gmail.com", "0672121940", "123433221", "Milan Italy");
        System.out.println(Bank.getAmountOfAccounts());
        Mono.setMoneyAmount(1223.0);
        System.out.println(Mono);
        System.out.println(us3);
        CreditAccount accountCredit2 = new CreditAccount();
        accountCredit2.setAccountNumber(" 3 ");
        accountCredit2.setAccountBalance(1500.2);
        Mono.setMoneyAmount(112.2);
        accountCredit2.setAccountLimit(10000.0);
        Mono.addAccount(accountCredit2);
        System.out.println(accountCredit2);
        accountCredit.withdraw(233.1);
        Mono.getMoneyAmountInfo();
        Bank.getTotalAmountOfClients(us3);

        System.out.println();
        System.out.println("---------------------------------------");


        BankClient us4 = new BankClient(4, "Vasyl Kolos", 34, "kolos@gmail.com", "0987898076", "1111", "Odessa Ukraine");
        CreditAccount accountCredit3 = new CreditAccount();
        BankClient us5 = new BankClient(5, "Nazar Kvashko", 44, "kvashko44@gmail.com", "0987865733", "1992", "Lviv Ukraine");
        DebitAccount debitAccount = new DebitAccount();
        BankClient us6 = new BankClient(6, "Yan Nikolaiev", 28, "yanyanyan623@gail.com", "0962101840", "1994", "Lviv Ukraine");
        DebitAccount debitAccount1 = new DebitAccount();


    }

}
