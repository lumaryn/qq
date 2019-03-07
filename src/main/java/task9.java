import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][4];
        int i;
        int j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.println("Введите число");
                a[i][j] = sc.nextInt();
            }
        }
        //i=0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] * 3 + ", " + "\t");
        }
    }
}
