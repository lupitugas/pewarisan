package Polimorphisme;

public class staf extends pegawai {
    private static final int gajiStaf =50000;
    private static final int bonusStaf = 100000;

    @Override
    public int gaji (){
        return gajiStaf;
    }

    public int bonus (){
        return bonusStaf;
    }
}
