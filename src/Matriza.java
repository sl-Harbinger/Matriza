import java.io.IOException;
import java.util.Scanner;

public class Matriza {
    public static void main(String[] args)  throws IOException {
        int n = 0;
        int m = 0;

        try (Scanner sc = new Scanner(System.in)) {//сканер с ресурсами)
            //ввод данных
            System.out.println("Введите количество рядов n");
            n = sc.nextInt();
            System.out.println("Введите количество столбцов m");
            m = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
        Proverka otvet = new Proverka();
        otvet.getMatr(n, m);

    }
}
