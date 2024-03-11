public class HesapMakinesi {
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
    public float karesiniAl(float x, float y){
        float sonuc = (float)Math.pow(x,2);
        return sonuc;
    }

    public float ussunuAl(float x, float y) {
        float sonuc = (float)Math.pow(x,y);
        return sonuc;
    }


}
