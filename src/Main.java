import java.util.Scanner;

public class Main {

    interface TaskOne {
        boolean task(int value);
    }

    interface TaskTwo {
        String task(String one, String two);
    }

    interface TaskThree {
        double task(double a, double b, double c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // the first task
        TaskOne task = (value) -> value % 13 == 0;
        int num = scanner.nextInt();
        System.out.println(task.task(num));


        // the second task
        TaskTwo taskTwo = (str1, str2) -> {
            if (str1.length() > str2.length()) {
                return str1;
            } else {
                return str2;
            }
        };
        String string1 = scanner.next();
        String string2 = scanner.next();
        System.out.println(taskTwo.task(string1, string2));

        //the third task
        TaskThree taskThree = (a, b, c) -> b * b - 4 * a * c;
        System.out.println(taskThree.task(1.213, 2.123, 3.123));

        //the fourth task
        TaskThree taskFourth = (a, b, c) -> a * Math.pow(b, c);
        System.out.println(taskFourth.task(1.213, 2.123, 3.123));
    }
}