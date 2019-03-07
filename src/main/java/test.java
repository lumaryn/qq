import java.io.*;
public class test {

    public static void main(String[] args) {
        String s;

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\test.txt"));
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка" + e);
        }
    }
}