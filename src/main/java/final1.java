import java.util.Scanner;

public class final1 {
    public static void main(String[] args) {
        int i, z, x, k, s;
        z=0;
        s=0;

        System.out.println("Введите число в двоичной системе счисления: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        k = x;

        while (x > 0) {
            x = x / 10;
            z++;
        }
        for (i = 0; i < z; i++) {

            s = (k % 10) * (int) Math.pow(2, i) + s;
            k = k / 10;
            ;
        }
        System.out.println(s);
    }
}
