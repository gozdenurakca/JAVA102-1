import java.util.Scanner;

public class Oylesine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyelini hesaplamak istediğini sayıyı giriniz : ");
        int sayi = input.nextInt();
        int faktoriyel = sayi;

        for (int i = sayi - 1; i >0 ; i--)
        {
            faktoriyel *= i;
        }
        System.out.println(faktoriyel);
    }
}
