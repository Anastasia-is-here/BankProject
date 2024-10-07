import java.util.Date;

public class BankAccount {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public BankAccount(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    // Метод для получения ID
    public int getId() {
        return id;
    }

    // Метод для получения баланса
    public double getBalance() {
        return balance;
    }

    // Метод для получения годовой процентной ставки
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Метод для получения даты создания счета
    public Date getDateCreated() {
        return dateCreated;
    }

    // Метод для начисления ежемесячного процента
    public void applyMonthlyInterest() {
        double monthlyInterest = (annualInterestRate / 12) / 100 * balance;
        balance += monthlyInterest;
    }

    // Метод для снятия денег
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        balance += amount;
    }
}