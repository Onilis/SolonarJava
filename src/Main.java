import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число (А); ");
        int A = scanner.nextInt();
        System.out.println("Введите первое число (B); ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("A > B");
        } else if (A < B) {
            System.out.println("A < B");
        } else {
            System.out.println("A = B");
        }
        System.out.println("Сложение: " + (A + B));
        System.out.println("Вычитание: " + (A - B));
        if (B != 0) {
            System.out.println("Деление: " + ((double) A / B));
        } else {
            System.out.println("Деление: на ноль делить нельзя");
        }
        System.out.println("Умножение: " + (A * B));
        scanner.nextLine();

        System.out.println("Введите первую строку (StrA): ");
        String StrA = scanner.nextLine();

        System.out.println("Введите вторую строку (StrB): ");
        String StrB = scanner.nextLine();

        if (StrA.equals(StrB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
            scanner.nextLine();
        }
        int[] numbers = new int[11];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.print("Четные числа: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}