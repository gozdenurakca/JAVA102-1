import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Ogrenci ogr = new Ogrenci();
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz : ");
        ogr.isim = input.nextLine();
        System.out.print("Lütfen yaşınızı giriniz : ");
        ogr.yas = input.nextInt();

        Lab4 sonuc = new Lab4();
        sonuc.OgrenciBilgileri(ogr);

        System.out.println(ogr.isim);
        System.out.println(ogr.yas);


    }
    public void OgrenciBilgileri(Ogrenci ogrenci)
    {
        ogrenci = new Ogrenci();
        ogrenci.isim = "Gözde Nur";
        ogrenci.yas = 23;
        System.out.println(ogrenci.isim);
        System.out.println(ogrenci.yas);
    }

}
