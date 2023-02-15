package lt.jolanta.interfc;

public class Mobilus extends Telefonas {

    private String simNr;
    private int nuotraukuSkaicius = 0;

    public int[] getNuotraukuSkaicius() {
        return new int[]{nuotraukuSkaicius};
    }

    public Mobilus(String numeris, String simNr) {
        super(numeris);
        this.simNr = simNr;



//// // metodas fotografuok, padidina nuotraukuSakcius vienu vienetu.
//    // visi geteriai
//    // Overide toString formanu: Mobilius[numeris: xxx, simNr: xxx, melodija: xxx, nuotraukos: xxx]
//    // main metode keleta kartu iskviesti metoda fotografuok ir atspausdinti objekta

    }
}
