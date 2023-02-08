import java.util.Scanner;

// 6. Создать класс, который принимает аргументом, какую задачу он должен решить:
// “найти минимум из 2 чисел”,
// “найти сумму элементов массива”,
// “вывести строку с конца”.
// На выходе этот класс пишет в консоль Java-код, который решает заданную задачу.
// Ко всем переменным обращаться можно ТОЛЬКО используя this.
class HomeWord6 {
    public static void main(String[] args) {
        int variant = getQuestion();
        Options options = new Options();

        if (variant == 1) {
            System.out.println("Выполним задачу \"Найдем минимум из 2-ч чисел\"");
            options.x = readIntNumber();
            options.y = readIntNumber();
            options.minNumber();
        } else if (variant == 2) {
            System.out.println("Выполним задачу \"найти сумму элементов массива\"");
            options.arraySum();
        }
        if (variant == 3) {
            System.out.println("Выполним задачу \"вывести строку с конца\"");
            options.str = getReadString();
            options.setStr();
        }
    }

    static int readIntNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        return scanner.nextInt();
    }

    static String getReadString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return scanner.nextLine();
    }

    static int getQuestion() { // выбираем вариант выполнения кода
        System.out.println("Выберите один из вариантов выполнения кода (1,2,3)? ");
        System.out.println("1. \"найти минимум из 2 чисел\"");
        System.out.println("2. \"найти сумму элементов массива\"");
        System.out.println("3. \"вывести строку с конца\"");
        return readIntNumber();
    }
}

public class Options {
    int x;
    int y;
    int minNum;
    String str;

    void minNumber() {
        this.minNum = Math.min(this.x, this.y);
        System.out.println("Код для решения данной задачи:");
        System.out.println("this.minNum = Math.min(this.x, this.y);");
        System.out.println("Минимальное число равно: " + this.minNum);
    }

    void arraySum() {
        System.out.println("Введите числа в массив");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) array[i] = getReadNumber();
        int sum = 0;
        for (int i = 0; i < 5; i++) sum = array[i] + sum;
        System.out.println("Код для решения данной задачи:");
        System.out.println("int sum = 0;");
        System.out.println("int[] array = new int[5];");
        System.out.println("for (int i = 0; i < 5; i++) array[i] = readIntNumber();");
        System.out.println("for (int i = 0; i < 5; i++) sum = array[i] + sum;");
        System.out.println("Cумма элементов массива равна: " + sum);
    }

    void setStr() {
        StringBuilder builder = new StringBuilder(this.str);
        String reversStr = builder.reverse().toString();
        System.out.println("Код для решения данной задачи:");
        System.out.println("StringBuilder builder = new StringBuilder(this.str);");
        System.out.println("String reversStr=builder.reverse().toString();");
        System.out.println("Строка с конца: " + reversStr);
    }

    int getReadNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }
}
