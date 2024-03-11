import java.util.Scanner;

public class Lab1 {
    private int x = 20;
    private static int y = 30;

    public void normalMethod() {
        // statik olmayan metotlarda hem normal değişkenlere hem de statik değişkenlere erişim vardır.
        System.out.println(x);
        System.out.println(y);
    }

    public static void staticMethod() {
        // statik olan metotlarda statik olmayan değişkenlere erişilemez.
        // yani x'e erişilemez, erişmek istiyorsan private static int x = 20 olarak atayabiliriz.
        System.out.println(20);
    }

    public static int max(int x, int y, int z) {
        int max = x;
        if (y > x && y > z) {
            max = y;
            System.out.println("Maksimum değer: " + y);
        } else if (z > x && z > y) {
            max = z;
            System.out.println("Maksimum değer : " + z);
        } else {
            max = x = y = z;
            System.out.println("Hepsi eşittir.");
        }
        return max;
    }
    public static double max(double x, double y, double z) {
        double max = x;
        if (y > x && y > z) {
            max = y;
            System.out.println("Maksimum değer: " + y);
        } else if (z > x && z > y) {
            max = z;
            System.out.println("Maksimum değer : " + z);
        } else {
            max = x = y = z;
            System.out.println("Hepsi eşittir.");
        }
        return max;
    }

    public static void main(String[] args) {
        Lab1 ilk = new Lab1();
        ilk.normalMethod();
        Lab1.staticMethod();
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayı : ");
        int x = input.nextInt();
        System.out.print("2. Sayı : ");
        int y = input.nextInt();
        System.out.print("3. Sayı : ");
        int z = input.nextInt();
        Lab1.max(x,y,z);


        System.out.println();

        System.out.print("1. Sayı : ");
        double a = input.nextDouble();
        System.out.print("2. Sayı : ");
        double b = input.nextDouble();
        System.out.print("3. Sayı : ");
        double c = input.nextDouble();
        Lab1.max(a,b,c);
    }
}

