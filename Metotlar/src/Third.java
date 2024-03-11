import java.util.Scanner;

public class Third {
        public void merhaba() {
            System.out.println("Merhaba");
        }
        public static void selam() {
            System.out.println("Selamlar..");
        }

        public int topla(int x,int y) {
            int sonuc = x + y;
            return sonuc;
        }


        //main method uygulamanın giriş noktasıdır.
        public static void main(String[] args) {
            // 2 türlü de olur :
            new Third().merhaba();

            Third metot = new Third();
            metot.merhaba();

            selam();
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen 2 tane sayı giriniz : ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            System.out.println("Sonuc : " + new Third().topla(number1,number2));
        }
}