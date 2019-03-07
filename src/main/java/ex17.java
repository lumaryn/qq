import java.io.*;

public class ex17 {

    public static void main(String args[]) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Если ввод завершен, введите 'stop'");
        try (FileWriter fw = new FileWriter("C:\\Users\\admin\\Desktop\\test.txt"))
        {
            do {
                System.out.println("Введите данные:");
                s = br.readLine();
                if (s.compareTo("stop") == 0) break;
                s = s + "\r\n";
                fw.write(s);
            }
            while (s.compareTo("stop") != 0);
        }
        catch (IOException e) {
            System.out.println("error");
        }
    }
}