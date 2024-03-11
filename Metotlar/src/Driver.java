import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        HesapMakinesi hesap = new HesapMakinesi();
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayı : ");
        float x = input.nextFloat();
        System.out.print("2.Sayı : ");
        float y = input.nextFloat();

        System.out.println("Toplama sonucu :" + hesap.topla(x,y));
        System.out.println("Çıkarma sonucu :" + hesap.cikarma(x,y));

        System.out.print("1.Sayı : ");
        float i = input.nextFloat();
        System.out.print("2.Sayı : ");
        float j = input.nextFloat();

        System.out.println("Çarpma sonucu :" + hesap.carpma(i,j));
        System.out.println("Bölme sonucu :" + hesap.bolme(i,j));

        System.out.print("1.Sayı : ");
        float a = input.nextFloat();
        System.out.print("2.Sayı : ");
        float b = input.nextFloat();

        System.out.println(a + " sayısının karesi :" + hesap.karesiniAl(a,b));
        System.out.println(a + " sayısının "  + (int)b + ". üssü " + hesap.ussunuAl(a,b));







    }
}
