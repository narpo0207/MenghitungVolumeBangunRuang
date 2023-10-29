public class BangunRuang {
    
    float Luas (){
        System.out.println("Menghitung luas Bangun Ruang");
     return 0; }
    float Volume(){
        System.out.println("Menghitung Volume Bangun Ruang");
        return 0;
    }}
class Kubus extends BangunRuang{
    float sisi;
    float Luas() {
        float l = 6 * (sisi * sisi);
        System.out.print("luas Kubus adalah :");
        return l;
    }

    @Override
    float Volume() {
        float v = sisi*sisi*sisi;
        System.out.println("Volume Kubus adalah:");
        return super.Volume();
    }

}
class Balok extends  BangunRuang{
    float panjang,lebar,tinggi;

    @Override
    float Luas() {
        float l = 2*(panjang*lebar+panjang*panjang*tinggi+lebar*tinggi);
        System.out.println("luas");
        return l;
    }

    @Override
    float Volume() {
        float v = panjang*lebar*tinggi;
        System.out.println("volume Balok Adalah:");
        return v;

    }
}

class  Bola extends  BangunRuang{
    float r;

    @Override
    float Luas() {
        float l =(float) (Math.PI*4/3*4*r*r);
        System.out.println("Luas permukaan bola adalah:");
        return l;
    }

    @Override
    float Volume() {
        float v = (float)(Math.PI*4/3*r*r*r);
        System.out.print("Volume Bola adalah :");
        return v;

    }
}

