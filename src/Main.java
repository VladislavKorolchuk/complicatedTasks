public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int eresult = a * (b + (c - d * e));
        System.out.println(~eresult + 1); // или System.out.println(-eresult);
    }

    public static void task2() {
        int a = 5, b = 7;
        // меняем местами пошагово с помощью XOR
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a=" + a + "  b=" + b);
    }

    public static void task3() {
        int a = 605;
        int b = (a / 10) % 10;
        System.out.println(b);
    }

    public static void task4() {
        int age = 23; // Возраст
        int salary = 55_000; //Зарплата
        int limit = salary * 2;
        if (age >= 23) {
            limit = limit + salary;
        }
        if (salary >= 80_000) {
            limit = (int) (limit * 1.5);
        } else if (salary >= 50_000) {
            limit = (int) (limit * 1.2);
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }

    public static void task5() {
        int age = 25; // Возраст клиента
        int salary = 90_000; // Зарплата клиента
        int wantedSum = 330_000; // Желаемая сумма кредита
        double bet = 10.0f; // Ставка (базовая 10%) годовых
        if (age <= 23) {
            bet += 1;
        } else if (age <= 30) {
            bet += 0.5;
        }
        if (salary >= 80_000) {
            bet -= 0.7;
        }
        double maxSum = (wantedSum / 12) + ((wantedSum * bet / 100) / 12); // Максимальный платеж
        System.out.print("Максимальный платеж при ЗП " + salary + " равен " + String.format("%.2f", maxSum) + " рублей. Платеж по кредиту " + String.format("%.2f", maxSum * 12));

        if (maxSum > salary / 2) {
            System.out.println(" - Отказано");
        } else {
            System.out.println(" - Одобрено");
        }

    }


}