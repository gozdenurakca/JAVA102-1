import java.util.Arrays;
public class Alistirma4 {

    public static int[] ciftSayilar(int[] sayilar) {
        int[] sonuc = null;
        int adet = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                adet++;
            }
        }
        sonuc = new int[adet];
        int index = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                sonuc[index++]  = sayilar[i];
            }
        }
        return sonuc;
    }
    public static void main(String[] args) {

        int[] sonuc = Alistirma4.ciftSayilar(new int[] {1,2,3,4,5,6,7,8,9});
        System.out.println(Arrays.toString(sonuc));
    }
}
