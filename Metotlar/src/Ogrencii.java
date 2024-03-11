import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Ogrencii {
    String ad;
    String soyad;
    int yas;


    public Ogrencii() {
        Scanner input = new Scanner(System.in);
        System.out.print("Adınız nedir ? ");
        ad = input.nextLine();
        System.out.print("Soyadınız nedir ? ");
        soyad = input.nextLine();
        System.out.print("Yaşınız nedir ? ");
        yas = input.nextInt();
    }
    public Ogrencii(String ad, String soyad, int yas) {
        Scanner input = new Scanner(System.in);
        System.out.print("Adınız nedir ? ");
        ad = input.nextLine();
        System.out.print("Soyadınız nedir ? ");
        soyad = input.nextLine();
        System.out.print("Yaşınız nedir ? ");
        yas = input.nextInt();
    }

    public static void main(String[] args) {
        Ogrencii ogr = new Ogrencii();
    }

}
