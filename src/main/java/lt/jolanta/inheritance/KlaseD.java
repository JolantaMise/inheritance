package lt.jolanta.inheritance;

public class KlaseD extends KlaseB{
    String testA;
    public KlaseD(String testA, String kintamasisB_A, String kintamasisA_A) {
        super(kintamasisB_A, kintamasisA_A);
        kintamasisA_A = "";
        super.kintamasisB_A = "";
        this.testA = testA;
    }

    @Override
    public void doSomethingB_A() {
        super.doSomethingB_A();

    }

    @Override
    public String toString() {
        return "KlaseD{" +
                "testA='" + testA + '\'' +
                '}';
    }
}

