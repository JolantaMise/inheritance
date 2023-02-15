package lt.jolanta.interfc;

public class MainTelefonas {
    public static void main(String[] args) {

        String numeris;
        Telefonas telefonas01 = new Telefonas("8-5- 123 12345");
        Mobilus mobilus01 = new Mobilus("55555555","4561");
        Taksofonas taksofonas01 = new Taksofonas(0.55);

        //telefonas [numeris: xxxx, melodija: xxx]
        System.out.println(telefonas01);
        telefonas01.paskambink("54704");
        telefonas01.setMelodija("tadam-tadam-tadam");
        System.out.println(telefonas01);

        System.out.println(mobilus01);
        mobilus01.paskambink("5555555555552");
        mobilus01.setMelodija("kakakakdu");
        System.out.println();

        System.out.println();
        System.out.println(taksofonas01);
        taksofonas01.paskambink("565656565");
        System.out.println(taksofonas01);


        System.out.println();
        System.out.println(taksofonas01);
        taksofonas01.paskambink(String.valueOf("556532456"));
        taksofonas01.paskambink(String.valueOf("656176"));

        taksofonas01.papildykLikuti(0.5);
        taksofonas01.paskambink(String.valueOf("556532456"));
        taksofonas01.paskambink(String.valueOf("656176"));
        System.out.println(taksofonas01);
        taksofonas01.papildykLikuti(0.5);
        System.out.println(taksofonas01);

    }
}
