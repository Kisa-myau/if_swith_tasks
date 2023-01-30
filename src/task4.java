import java.util.Scanner;

public class task4 {
    static String getTriangleType(int a,int b, int c){
        if ((a+b>c|| a+c>b|| b+c>a) & (a>0 & b>0 & c>0)) {
            if ((c^2) == (a^2 +b^2)) return "right";
            if ((c^2) > (a^2 +b^2)) return "obtuse";
            if ((c^2) < (a^2 +b^2)) return "acute";
            else return "other";
        }
        else return "impossible";
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

        System.out.println(getTriangleType(a,b,c));
    }
}
