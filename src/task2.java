import java.util.Scanner;

public class task2 {
    static String day;
    static String getDay(int a){
            switch (a) {
                case 1:
                    return day = "Monday";
                case 2:
                   return day = "Tuesday";
                case 3:
                    return day = "Wednesday";
                case 4:
                    return day = "Thursday";
                case 5:
                    return day = "Friday";
                case 6:
                    return day = "Saturday";
                case 7:
                    return day = "Sunday";
                default:
                    return "Число не в заданном диапазоне. Введите число от 1 до 7 включительно";
            }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7 включительно ");
        int a = in.nextInt();
        in.close();

        System.out.println(getDay(a));
    }
}
