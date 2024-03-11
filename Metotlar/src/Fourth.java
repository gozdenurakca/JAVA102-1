import java.util.Scanner;

public class Fourth {
    public float topla(float x,float y) {
        return x+y;
    }
    public float cikarma(float x, float y) {
        return x-y;
    }
    public float carpma(float x, float y) {
        return x*y;
    }
    public float bolme(float x, float y) {
        return x/y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayı : ");
        float x = input.nextFloat();
        System.out.print("2. Sayı : ");
        float y = input.nextFloat();

        HesapMakinesi topla = new HesapMakinesi();
        System.out.println("Toplama sonucu : " + new Fourth().topla(x,y));
        System.out.println("Çıkarma sonucu : " + new Fourth().cikarma(x,y));
        System.out.print("1. Sayı : ");
        float i = input.nextFloat();
        System.out.print("2. Sayı : ");
        float j = input.nextFloat();
        System.out.println("Çarpma sonucu : " + new Fourth().carpma(i,j));
        System.out.println("Bölme sonucu : " + new Fourth().bolme(i,j));


    }

}
