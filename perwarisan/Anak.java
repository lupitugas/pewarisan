package perwarisan;

public class Anak extends Ayah {
    double nilaimax = 99.9;
    String nama = "dina";
    int age = 17;

    //public void setnama (String nama){ this.nama = nama ; }

    public void cetak(){
        System.out.println("Anak ini memiliki sifat "+super.sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("Berumur "+age+" tahun");
        System.out.println("dengan tinggi badan "+super.TB);
        super.hobi();
    }
}
