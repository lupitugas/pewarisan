package perwarisan.overranning;

public class persegi extends BangunDatar {
    float sisi;

    public void luas(){
        float luas =sisi*sisi;
        System.out.println("luas persegi = " + luas);
    }

    public void keliling(){
        float keliling =4*sisi;
        System.out.println("keliling persegi = " + keliling);
    }
}
