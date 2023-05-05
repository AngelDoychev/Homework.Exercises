package JavaAdvance.DefiningClasses.BankAccountProblem;

public class BankAccount {
    private int Id;
    private double balance;
    private static int bankAccountCount = 0;
    private static double interest = 0.02;

    public BankAccount() {
        bankAccountCount++;
        this.Id = bankAccountCount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public static void setInterestRate(double interest) {
        BankAccount.interest = interest;
    }

    public double getInterest(int years) {
        return BankAccount.interest * years * this.balance;
    }

    public int getId() {
        return Id;
    }
}
