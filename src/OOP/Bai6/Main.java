package OOP.Bai6;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Ted Murphy", 72354, 102.56);
        Account acc2 = new Account("Jane Smith", 69713, 40.00);
        Account acc3 = new Account("Edward Demsey", 93757, 759.32);

        acc1.deposit(25.85);
        acc2.deposit(500.00);
        acc2.withdraw(430.75,1.50);
        acc3.addInterest();
        String fl =String.format("%-20s %-30s %20s %6s","AccountNumber","Name","Balance","RATE");
        System.out.println(fl);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());

        System.out.println("-------------------------------------------------------------------------------");
        acc2.transfer(acc1,100.00);

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
    }
}
