import java.util.Arrays;
import java.util.Scanner;

public class Lab2 {
    public static boolean majority(boolean x, boolean y, boolean z) {
        return (x&&y) || (x&&z) || (y&&z);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Okuyor musunuz ? (true/false) ");
        boolean is1 = input.nextBoolean();
        System.out.print("Evli misiniz ? (true/false) ");
        boolean is2 = input.nextBoolean();
        System.out.print("Kardeşiniz var mı ? (true/false) ");
        boolean is3 = input.nextBoolean();

        boolean is = Lab2.majority(is1, is2,is3);
        System.out.println(is);
    }
}
