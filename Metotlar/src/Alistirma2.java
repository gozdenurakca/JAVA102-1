import java.util.Scanner;

public class Alistirma2 {

    public static int cube(int x) {
        return x * x * x;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kübünü almak istediğiniz sayıyı giriniz : ");
        int a = input.nextInt();
        System.out.println(a + " sayısının kübü = " + Alistirma2.cube(a));

    }
}
