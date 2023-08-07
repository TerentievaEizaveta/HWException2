import java.util.Scanner;

public class task4 {
    /*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */

    public static void main(String[] args) {
        ex0();
    }

    public static void ex0() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = scanner.nextLine();
        try {
            if (str.equals("")) {
                throw new Exception();
            }
            System.out.println(str);
        } catch (Exception e) {
            {
                System.out.println("Пустые строки вводить нельзя");
            }
        }
    }
}
