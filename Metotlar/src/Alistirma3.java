import java.util.Arrays;
import java.util.Scanner;

public class Alistirma3 {

    public static int toplam(int[] x){
        int result = 0;
        for(int i = 0; i < x.length; i++)
        {
            result += x[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin uzunluğu kaç olsun ? ");
        int uzunluk = input.nextInt();
        int[] numbers = new int[uzunluk];
        for (int i = 0; i < uzunluk ; i++) {
            System.out.print((i+1) + ".Sayı : ");
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sonuç : " + Alistirma3.toplam(numbers));


    }
}
