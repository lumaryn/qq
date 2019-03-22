import java.util.Scanner;

public class final2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int i = sc.nextInt();
        int a[] = new int[i];
        for (i = 0; i < a.length; i++) {
            System.out.println("Введите число");
            a[i] = sc.nextInt();
        }
        for (i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                   int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

            }
        }
    }
