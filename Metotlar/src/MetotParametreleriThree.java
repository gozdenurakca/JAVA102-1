import java.util.Scanner;

public class MetotParametreleriThree {
    public void testing(final int x) {
        // x = 20 gibi bir şey koyamayız çünkü main metottan ne gelirse onu basacak.
        System.out.println(x);
    }

    public static void main(String[] args) {
        MetotParametreleriThree ucuncu = new MetotParametreleriThree();
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz -> ");
        int x = input.nextInt();
        ucuncu.testing(x);
    }
}
