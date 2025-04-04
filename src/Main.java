import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printHello();
        System.out.println(hello("Elena"));

        System.out.printf("%s * %s = %s%s", 2, 3, multiply(2, 3), System.lineSeparator());

        int factorial = factorial(3);
        System.out.println(factorial);

        /**
         * дз4
         */

        String nexLine = System.lineSeparator();

        // 1
        int a = 1;
        int b = 3;
        System.out.printf("Сумма чисел в диапазоне от %s до %s - %s%s", a, b, sumRange(a, b), nexLine);

        //2
        int c = 4;
        int d = 2;
        System.out.printf("Сумма двух чисел %s и %s - %s%s", c, d, add(c, d), nexLine);

        String f = "Купи ";
        String g = "слона";
        String concatenated = add(f, g);
        System.out.printf("Результат конкатенации двух строк %s и %s - %s%s", f, g, concatenated, nexLine);

        //3
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.printf("Среди чисел %s самое большое число %s%s", Arrays.toString(numbers), findMax(numbers), nexLine);

        //4
        int number = 0;
        System.out.printf("Факториал числа %s = %s%s", number, getFactorial(number), nexLine);

        //5
        double circleRadius = 5;
        double length = 10;
        double width = 4;
        System.out.printf("Площадь круга с радиусом %s = %s%s", circleRadius, calculateArea(circleRadius), nexLine);
        System.out.printf("Площадь прямоугольника с длиной %s и шириной %s = %s%s",
                length, width, calculateArea(length, width), nexLine);

        //6
        int h = 2;
        int i = 3;
        int j = 4;
        System.out.printf("Среднее арифметическое чисел %s, %S, %s = %s%s", h, i, j, calculateAverage(h, i, j), nexLine);

        //7
        double k = 3.0;
        double l = 4.0;
        double hypotenuse = calculateHypotenuse(k, l);
        System.out.printf("Если длины катетов %s и %S, то длина гипотенузы: %s", k, l, hypotenuse);
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

    /**
     * дз4
     */

    /**
     * 1.  Создайте метод sumRange, который принимает два числа (начало и конец диапазона)
     *     и возвращает сумму всех чисел между ними (включительно).
     */
    public static int sumRange(int startNum, int endNum) {
        int sum = 0;
        for (int i = Math.min(startNum, endNum); i <= Math.max(startNum, endNum); i++) {
            sum += i;
        }
        return sum;
    }

    // 2 Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.

    public static int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static String add(String firstString, String secondString) {
        return firstString + secondString;
    }

    // 3 Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // 4 Напишите метод, вычисляющий факториал числа с помощью цикла for

    public static int getFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * 5 Создайте перегруженные методы calculateArea: Для круга (принимает радиус);
     * Для прямоугольника (принимает длину и ширину).
     */
    public static double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Длина и ширина не могут быть отрицательными");
        }
        return length * width;
    }

    // 6 Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.

    public static int calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    /**
     * 7 Напишите метод, который принимает два числа, представляющие длины катетов,
     * и возвращает длину гипотенузы (используйте теорему Пифагора).
     */
    public static double calculateHypotenuse(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Длина катета должна быть больше нуля.");
        }
        return Math.sqrt(a * a + b * b);
    }
}

