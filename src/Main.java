import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приветствуем в Currency Converter!");
        System.out.println("Выберите исходную валюту:");
        String[] currencies = {"EURO", "USD", "TL"};
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }
        System.out.println("0. Выход");
        while (true) {


            Scanner scanner = new Scanner(System.in);
            int initialCurrency = scanner.nextInt();
            if (initialCurrency == 0) {
                return;
            }
            System.out.println("Введите количество:");
            double amount = scanner.nextDouble();
            System.out.println("Выберите целевую валюту(из списка выше)");
            int targetCurrency = scanner.nextInt();

            double[] coefficient = {1, 1.06, 34.42};
            amount /= coefficient[initialCurrency - 1];
            amount *= coefficient[targetCurrency - 1];

            System.out.println("Total: " + amount + " " + currencies[targetCurrency - 1]);
        }
    }
}














