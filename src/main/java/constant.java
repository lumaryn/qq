import java.util.Scanner;

public class constant {
    public static void main(String[] args) {
        final int x = 5;
        final int y = 6;
        final int z = 7;

        System.out.println("Укажите переменую T");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        switch (T){
            case 5: System.out.println("Данное значение имеется в константах");
            break;
            case 6: System.out.println("Данное значение имеется в константах");
            break;
            case 7: System.out.println("Данное значение имеется в константах");
            break;
            default: System.out.println("Такой константы нет!");
        }
    }
}
