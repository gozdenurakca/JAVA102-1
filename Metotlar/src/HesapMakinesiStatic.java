public class HesapMakinesiStatic {
        public static float topla(float x,float y) {
            return x+y;
        }
        public static float cikarma(float x, float y) {
            return x-y;
        }
        public static float carpma(float x, float y) {
            return x*y;
        }
        public static float bolme(float x, float y) {
            return x/y;
        }
        public static float karesiniAl(float x, float y){
            float sonuc = (float)Math.pow(x,2);
            return sonuc;
        }

        public static float ussunuAl(float x, float y) {
            float sonuc = (float)Math.pow(x,y);
            return sonuc;
        }
}