public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
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
        int a = 605;
        int b = (a / 10) % 10;
        System.out.println(b);
    }

}