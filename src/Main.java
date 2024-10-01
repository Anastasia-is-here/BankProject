import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создание нового счета
        BankAccount account = new BankAccount(1234, 1000.0);

// Установка годовой процентной ставки
        BankAccount.setAnnualInterestRate(4.5);

// Получение даты создания счета
        Date creationDate = account.getDateCreated();
        System.out.println("Дата создания счета: " + creationDate);

// Начисление ежемесячного процента
        double monthlyInterest = account.getMonthlyInterest();
        System.out.println("Ежемесячный процент: " + monthlyInterest);

// Снятие суммы со счета
        account.withdraw(500.0);
        System.out.println("Новый баланс: " + account.getBalance());

// Пополнение счета
        account.deposit(200.0);
        System.out.println("Новый баланс: " + account.getBalance());
    }
}