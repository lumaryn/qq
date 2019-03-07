import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        String s = sc.nextLine();
        int x = Integer.parseInt(s);
        double y = (double) x;
        System.out.println("String "+s);
        System.out.println("Integer "+x);
        System.out.println("Double "+y);
    }
}
