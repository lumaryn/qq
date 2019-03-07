import java.io.*;

public class ex18 {
    public static void main(String[] args) {
        String s;
        int i = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\test.txt"));
            while ((s = br.readLine()) != null) {
                System.out.println(s + "; " + i);
                i++;
            }
        } catch (IOException e) {
            System.out.println("error" + e);
        }
        System.out.println("i= "+i);

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter("C:\\Users\\admin\\Desktop\\test.txt")) {
            while (i > 0) {
                System.out.println("Введите данные:");
                s = sc.readLine();
                s = s + "\r\n";
                fw.write(s);
                i--;
            }

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}

