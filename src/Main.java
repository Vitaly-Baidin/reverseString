import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input a String: ");

        String in = readConsole();

        System.out.println("\nIn: " + in);
        System.out.println("Out: " + reverseString(in));

        long before;

        before = System.currentTimeMillis();

        for (int i = 0; i < 1_000; i++) {
            reverseString(in);
        }
        System.out.println("after 1000 repetitions (ms): " + (System.currentTimeMillis() - before));

        before = System.currentTimeMillis();

        for (int i = 0; i < 10_000; i++) {
            reverseString(in);
        }
        System.out.println("after 10000 repetitions (ms): " + (System.currentTimeMillis() - before));

        before = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            reverseString(in);
        }
        System.out.println("after 100000 repetitions (ms): " + (System.currentTimeMillis() - before));

    }

    public static String readConsole() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
