public class MetotParametreleri {
    /*public  void passByValue(int x) {
        System.out.println("PBV : " + x);
        x = 10;
        System.out.println("PBV : " + x);
    }
    public static void main(String[] args) {
        MetotParametreleri metotum = new MetotParametreleri();
        int x = 20;
        System.out.println(x);
        metotum.passByValue(x);
        System.out.println(x);
    }

     */

    public void passByValue(int x)
    {
        System.out.println("PBV : " + x);
        x = 10;
        System.out.println("PBV :  " + x);
    }

    public static void main(String[] args) {
        int x = 20;
        MetotParametreleri driver = new MetotParametreleri();
        System.out.println(x);
        driver.passByValue(x);
        System.out.println(x);

    }






















}
