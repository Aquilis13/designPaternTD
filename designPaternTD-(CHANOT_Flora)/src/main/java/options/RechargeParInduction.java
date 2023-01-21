package options;

import defaultPackage.Appareil;
import defaultPackage.Option;

public class RechargeParInduction extends Option {

    public static final double PRIX =  30;

    public RechargeParInduction(Appareil appareil) {
        super(appareil, PRIX);
        appareil.ajoutOption(this);
    }
}
