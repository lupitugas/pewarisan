package Polimorphisme;

public class direktur extends pegawai {
    private static final int gajiDir =100000;
    private static final int tunjangan = 5000;

    @Override
    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }
}
