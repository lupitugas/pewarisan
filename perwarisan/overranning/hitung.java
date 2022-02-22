package perwarisan.overranning;

public class hitung {
    public static void main(String[] args){
        BangunDatar datar=new BangunDatar();

        persegi persegi=new persegi();
        persegi.sisi=8;

        PersegiPanjang panjang=new PersegiPanjang();
        panjang.lebar=11;
        panjang.panjang=2;

        datar.luas();
        datar.keliling();

        persegi.luas();
        persegi.keliling();

        panjang.luas();
        panjang.keliling();
    }
}
