import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считываем значения трёх целочисленных значений из консоли
        long A = in.nextLong();
        long B = in.nextLong();
        long C = in.nextLong();

        // Проверяем, есть ли нуль среди введённых чисел и выводим следующее сообщение, если есть
        if (A*B*C == 0) {
            out.println("Есть нулевые");
        }

        else {
            // Если нуля среди чисел нет, то проверяем, все ли числа положительные,
            // и выводим следующее сообщение, если это так
            if (A > 0 && B > 0 && C > 0) {
                out.println("Все числа положительные");
            }

            else {
                // Если не все числа положительные, проверяем являются ли все числа отрицательными,
                // и выводим следующее сообщение, если это так
                if (A < 0 && B < 0 && C < 0) {
                    out.println("Все числа отрицательные");
                }

                else {
                    // Если ни одно условие выполнено не было, то выводится следующее сообщение
                    out.println("Все числа положительные или отрицательные");
                }
            }
        }

    }
}
