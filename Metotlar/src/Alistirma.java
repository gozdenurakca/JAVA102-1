import java.util.Arrays;
import java.util.Scanner;

public class Alistirma {
    public static boolean eq(int[] x, int[] y) {
        boolean result = true;
        if(x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                if(x[i] != y[i]) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        } return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayılı bir dizi olsun ? ");
        int adet = input.nextInt();
        int[] x = new int[adet];
        for(int i = 0; i < x.length; i++)
        {
            System.out.print((i+1) + ". Sayı: ");

            x[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(x));
        System.out.print("Kaç sayılı bir dizi olsun ? ");
        int uzunluk = input.nextInt();
        int[] y = new int[uzunluk];
        for(int i = 0; i < y.length; i++)
        {
            System.out.print((i+1) + ". Sayı: ");
            y[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(y));

        System.out.println("Sonuç : " + Alistirma.eq(x,y));

    }
}
