import java.util.Scanner;

public class MetotParametreleriTwo {

    public void test(int x) {
        x = 10;
        System.out.println(x);
        // burada sonuç main metottan her ne değer gelirse gelsin 10 olarak basılır.
    }
    public static void main(String[] args) {

        MetotParametreleriTwo ikinci = new MetotParametreleriTwo();
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int x = input.nextInt();
        ikinci.test(x);
    }
}