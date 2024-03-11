public class Second {

    private void helloWorld() {
        System.out.println("Hello World");
    }
    private int topla(int x, int y) {
        int toplam = x + y;
        return toplam;
    }
    private float topla(float x, float y) {
        float toplam = x + y;
        return (float)toplam;
    }
    private int topla(byte x, byte y) {
        int toplam = x + y;
        return toplam;
    } private float topla(int x, float y) {
        float toplam = x + y;
        return (float) toplam;
    }
    public static void main(String[] args) {
        new Second().helloWorld();

        // böyle de olabilir;
        // System.out.println("Sonuç : " + new Second().topla(5,5));
        // fakat herhalde şu daha doğru bir kullanım ;
        Second toplamaSonucu = new Second();
        int sonuc = toplamaSonucu.topla(20,30);
        System.out.println("Sonuç : " +sonuc);
        System.out.println("Sonuç2: " + new Second().topla(2,2));
        System.out.println("Sonuç2: " + new Second().topla(4.23f,5.78f));
    }
}
