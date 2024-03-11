import java.util.Arrays;
import java.util.Scanner;

public class MetotParametreleriFour {
    public void varArgs(int[] numbers) {
        int x = numbers[0];
        int y = numbers[1];
        int toplam = numbers[0] + numbers[1];
        System.out.println("Toplam = " + toplam);
    }

    public static void main(String[] args) {
        MetotParametreleriFour dort = new MetotParametreleriFour();
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir dizi oluşturalım : ");
        int uzunluk = input.nextInt();
        if(uzunluk <= 1) {
            System.out.println("Lütfen uzunluk değerini 2 veya daha üstü bir değer giriniz. Tekrar deneyiniz.");
        } else {
            int[] sayilar = new int[uzunluk];
            for (int i = 0; i < sayilar.length ; i++) {
                System.out.print((i+1) + ". Sayı : ");
                sayilar[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(sayilar));

            dort.varArgs(sayilar);
        }
    }
}
