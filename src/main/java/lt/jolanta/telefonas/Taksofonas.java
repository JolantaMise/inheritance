package lt.jolanta.telefonas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Taksofonas extends Telefonas {

    private BigDecimal piniguLikutis;
    private final BigDecimal SKAMBUCIO_KAINA = BigDecimal.valueOf(0.25);

    public Taksofonas(double pinigas) {
        super("[cia yra taksofonas]");
        piniguLikutis = BigDecimal.valueOf(pinigas);

    }

    //metodas paskambinti patikrinti ar pakankamas pinigu likutis
    @Override
    public String toString() {
        return String.format("Telefonas[numeris: %s, melodija: %s], this.numeris, this.melodija", getNumeris(), this.piniguLikutis.setScale(2, RoundingMode.HALF_EVEN));

    }

    public void patikrinkPinigulikuti() {
        if (piniguLikutis.compareTo(SKAMBUCIO_KAINA) >= 0) {
            super.paskambink(getNumeris());
            piniguLikutis = piniguLikutis.subtract(SKAMBUCIO_KAINA);
        } else {
            System.out.println("pinigu  kiekis nepakankamas: " + piniguLikutis.setScale(
                    2, RoundingMode.HALF_EVEN));
        }
    }
    public void papildykLikuti (double pinigas) {
       this.piniguLikutis = piniguLikutis.add(BigDecimal.valueOf(pinigas));
    }

}

