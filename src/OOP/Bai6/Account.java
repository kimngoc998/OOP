package OOP.Bai6;


import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private double balance;
    private String name;
    final double RATE = 0.035;

    public Account() {
        accountNumber = 999999;
        name = "chưa xác định";
        balance = 50000;

    }

    public Account(String name,long accountNumber, double balance){
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = 999999;
        }
        if (balance >= 50000.0) {
            this.balance = balance;
        }else {
            this.balance = 50000.0;
        }
        if (!name.trim().equals("")) {
            this.name = name;
        }else {
            this.name = "chua xac dinh";
        }
    }
    public Account(long accountNumber, String name){
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = 999999;
        }
        if (!name.trim().equals("")) {
            this.name = name;
        } else {
            this.name = "chua xac dinh";
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean deposit(double amount){
        if(amount > 0){
            balance += amount;
            return true;
        }else return false;
    }

    public boolean withdraw(double amount, double fee){
        if(amount > 0 && (amount + fee) <= balance){
            balance = (long) (balance - amount - fee);
            return true;
        }else return false;
    }

    public void addInterest(){
        balance = balance + balance * RATE;
    }

    public boolean transfer(Account acc2, double amount){
        if(balance >= amount && amount > 0){
            balance = balance - amount;
            acc2.balance -= amount;
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        Locale local = new Locale("vi","vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);

        return String.format("%-20d %-30s %20s %6.3f", accountNumber, name, formatter.format(balance), RATE);
    }
}
