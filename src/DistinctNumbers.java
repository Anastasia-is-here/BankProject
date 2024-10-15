import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Введите число (0 для завершения): ");
            int number = scanner.nextInt();

            if (number == 0) break;



            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }

        System.out.println("Неповторяющиеся числа:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}