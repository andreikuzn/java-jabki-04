public class Main {

    public static void main(String[] args) {
        printHello();
        System.out.println(hello("Elena"));

        System.out.printf("%s * %s = %s%s", 2, 3, multiply(2, 3), System.lineSeparator());

        int factorial = factorial(3);
        System.out.println(factorial);
    }

    /**
     * (модификатор доступа)
     * (static - вызов метода возможен без создания обьекта)
     * (возвращаемый типа или void)
     * (имя метода)
     * (входящие параметры)
     */
    public static void printHello() {
        System.out.println("Hello");
    }

    public static String hello(String name) {
        return "Hello " + name;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Одниковые названия методов, но разные типы данных (входящие) или количество параметров
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    /**
     * Рекурсия
     * Факториал 3! = 1 * 2 * 3 = 6
     */
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * factorial(3)
     *     3 * factorial(2)
     *          2 * factorial(1)
     *               1 (базовый случай)
     *          -> 2 * 1 = 2
     *     -> 3 * 2
     * -> 6
     */
}