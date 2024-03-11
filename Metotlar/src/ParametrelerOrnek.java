import java.util.Arrays;
import java.util.Scanner;

public class ParametrelerOrnek {

    public void degistir (int[] sayilar) {
        for (int i = 0 ; i < sayilar.length; i++)
        {
            sayilar[i] = sayilar[i] * 2;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Array dizisinin uzunluğu kaç olsun ? ");
        int uzunluk = input.nextInt();
        int[] sayilar = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.print((i+1) + ". Sayı : ");
            sayilar[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(sayilar));
        ParametrelerOrnek ornek = new ParametrelerOrnek();
        ornek.degistir(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }
}
