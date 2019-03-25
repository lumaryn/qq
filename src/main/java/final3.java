import java.util.Scanner;

public class final3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite kurs dollara");
        double k = sc.nextDouble();
        System.out.println("Vvedite kolichestvo rublei");
        double r= sc.nextDouble();
        double d = r/k;
        d=(double)Math.round(d*100)/100;
        System.out.println("$= "+d);

    }
}
