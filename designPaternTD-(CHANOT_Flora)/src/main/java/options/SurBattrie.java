package options;

import defaultPackage.Appareil;
import defaultPackage.Option;

public class SurBattrie extends Option {
    public static final double PRIX =  20;

    public SurBattrie(Appareil appareil) {
        super(appareil, PRIX);
        appareil.ajoutOption(this);
    }
}
