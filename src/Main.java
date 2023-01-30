import java.util.Scanner;

public class Main {
        static int biggestOfThree (int a, int b, int c) {
                if (a >= b & a >= c)
                        return a;
                if (b >= a & b >= c)
                        return b;
                else
                        return c;
        }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a: ");
            int a = in.nextInt();
            System.out.println("Input b: ");
            int b = in.nextInt();
            System.out.println("Input c: ");
            int c = in.nextInt();
            in.close();

            int largest;
            largest = biggestOfThree(a,b,c);

            System.out.println("Наибольшее из чисел равно " + largest);

    }
}
