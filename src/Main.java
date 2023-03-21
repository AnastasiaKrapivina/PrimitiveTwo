public class Main {
    public static void main(String[] args) {
        int balanceStart = 150; // Начальный счёт
        int sum = 1200; // Сумма пополнения
        int bonus;

        if (sum >= 1000) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus + " - Количество бонусных рублей");
        System.out.println(balanceStart + sum + bonus + " - Итоговая сумма на счету клиента");
    }
}