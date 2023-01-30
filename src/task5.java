import java.util.Scanner;

public class task5 {
    static String getSdacha (int a,int b,int c, int d){
        if (a>=0&b>=0&c>=0&d>=0) return (c-a) +" рублей " + (d-b) + " копеек";
        else return "Введите целые положительные числа";

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите цену товара в рублях: ");
        int a = in.nextInt();
        System.out.println("Копеек в цене товара: ");
        int b = in.nextInt();
        System.out.println("Заплатили за товар рублей: ");
        int c = in.nextInt();
        System.out.println("Заплатили за товар копеек: ");
        int d = in.nextInt();
        in.close();

        System.out.println("Сдача равна" + getSdacha(a,b,c,d));
    }
}
