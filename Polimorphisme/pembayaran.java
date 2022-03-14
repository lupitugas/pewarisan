package Polimorphisme;

class pembayaran {
    public int hitunggaji (pegawai peg){
        int uang =peg.gaji();

        if (peg instanceof direktur)
        uang += ((direktur)peg).tunjangan();

        if (peg instanceof staf )
        uang += ((staf)peg).bonus();

        return uang;
    }
    public static void main(String [] args) {
        pembayaran pg = new pembayaran();
        staf ali = new staf();
        direktur tony = new direktur();
        System.out.println("Gaji Staf = "+pg.hitunggaji(ali));
        System.out.println("Gaji Direktur = "+pg.hitunggaji(tony));
    }
}
