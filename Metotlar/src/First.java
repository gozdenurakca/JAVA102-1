import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println(Math.pow(2,4));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.PI);

        Scanner input = new Scanner(System.in);
        System.out.print("Bir text dizisi giriniz -> ");
        String text = input.nextLine();
        System.out.println(text.toUpperCase());

    }
}
