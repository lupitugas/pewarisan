package perwarisan.overranning;

public class PersegiPanjang extends BangunDatar {
    float panjang,lebar;

    public void luas(){
        float luas= panjang*lebar;
        System.out.println("luas persegi panjang = "+luas);
    }

    public void keliling(){
        float keliling=2*(panjang+lebar);
        System.out.println("keliling persegi panjang = "+keliling);
    }
}
