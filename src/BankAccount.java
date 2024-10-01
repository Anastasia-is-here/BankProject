import java.util.Date;

public class BankAccount {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // Безаргументный конструктор
    public BankAccount() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // Конструктор с указанными id и balance
    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // Getter и setter методы
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Метод для получения ежемесячного процента
    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 100 / 12);
    }

    // Метод для снятия средств со счета
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        balance += amount;
    }
}
