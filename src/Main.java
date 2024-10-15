import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BankAccount account = new BankAccount(1155, 300000, 6.5);


        account.withdraw(16500);
        account.deposit(50000);

        BankAccount[] accounts = new BankAccount[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new BankAccount(i, 10000, 5.0);
        }


        System.out.println("Баланс: " + account.getBalance());
        account.applyMonthlyInterest();
        System.out.println("Ежемесячные проценты начислены.");
        System.out.println("Баланс после начисления процентов: " + account.getBalance());
        System.out.println("Дата создания счета: " + account.getDateCreated());

        while (true) {
            System.out.print("Введите ID счета: ");
            int enteredId = scanner.nextInt();

            if (enteredId != account.getId()) {
                System.out.println("Некорректный ID. Попробуйте снова.");

                continue;
            }

            // Меню пользователя
            while (true) {
                System.out.println("\nГлавное меню:");
                System.out.println("1. Просмотреть баланс");
                System.out.println("2. Снять деньги");
                System.out.println("3. Внести деньги");
                System.out.println("4. Выйти");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Текущий баланс: " + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Введите сумму для снятия: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        System.out.println("Операция выполнена. Текущий баланс: " + account.getBalance());
                        break;
                    case 3:
                        System.out.print("Введите сумму для внесения: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Операция выполнена. Текущий баланс: " + account.getBalance());
                        break;
                    case 4:
                        System.out.println("Выход из меню.");
                        break;
                    default:
                        System.out.println("Некорректный ввод.");
                }

                if (choice == 4) {
                    break;
                }
            }
        }
    }
}