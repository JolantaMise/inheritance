package lt.jolanta.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        KlaseA klaseA = new KlaseA("");
        KlaseB klaseB = new KlaseB("","");
        KlaseC klaseC = new KlaseC("");
        KlaseD klaseD = new KlaseD("", "", "");

        klaseA.kintamasisA_A = "asdfa";
        klaseA.doSomethingA_A();

        klaseB.kintamasisA_A = "kita reiksme A";
        klaseB.kintamasisB_A = "kita reiksme B";
        klaseB.doSomethingA_A();

        klaseC.kintamasisA_A = "dar kita reiksme";
        klaseC.kintamasisC_A = "dar kita reiksme A";
        klaseC.doSomethingA_A();
        klaseC.doSomethingC_A();

        klaseD.kintamasisA_A = "tiesiog reiskme A";
        klaseD.kintamasisB_A = "tiesiog reiskme B";
        klaseD.doSomethingA_A();
        klaseD.doSomethingB_A();





    }
}
