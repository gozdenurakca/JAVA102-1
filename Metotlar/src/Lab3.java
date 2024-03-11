import java.util.Arrays;

public class Lab3 {
    public static void degistir(int[] sayilar) {
        int temp = sayilar[0];
        sayilar[0] = sayilar[1];
        sayilar[1] = temp;
    }

    public static void main(String[] args) {

        int[] sayilar = {10,20};
        System.out.println(Arrays.toString(sayilar));
        Lab3.degistir(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
}


