import java.util.Scanner;

public class task3 {
    static String isYearVisososniy (int a){
        if (a % 4 == 0 & a%100!=0||a%400==0) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год - целое, положительное, не превышающее 30000 число ");
        int a = in.nextInt();
        in.close();

        if (a<30000&a>0) System.out.println(isYearVisososniy(a));
        else System.out.println("Введите число из заданного диапазона!");

    }
}

