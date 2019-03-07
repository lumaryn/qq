import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first text");
        String st1 = sc.nextLine();
        System.out.println("input second text");
        String st2 = sc.nextLine();
        int i = st1.length();
        int j = st2.length();
        if (i>j) {
            System.out.println(st1);
        }
        else if(i==j){
            System.out.println("try again");
        }
        else {
            System.out.println(st2);
        }
    }
}
