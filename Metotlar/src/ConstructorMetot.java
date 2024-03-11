import java.util.Scanner;

public class ConstructorMetot {

    // bu, sınıfın yapıcı metotudur.
    int x;

    public ConstructorMetot() {
        System.out.println("Heyyyooo");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        x = input.nextInt();

    }
    public static void main(String[] args) {
        ConstructorMetot cons = new ConstructorMetot();
        System.out.println(cons.x);

        Ogrencii ogr = new Ogrencii();
        System.out.println(ogr.ad);
        System.out.println(ogr.soyad);
        System.out.println(ogr.yas);

        System.out.println();

        Ogrencii ogr2 = new Ogrencii();
        System.out.println(ogr2.ad);
        System.out.println(ogr2.soyad);
        System.out.println(ogr2.yas);

    }
}
