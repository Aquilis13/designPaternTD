package options;

import defaultPackage.Appareil;
import defaultPackage.Option;

public class SeBrancheEnUsb extends Option {

    public static final double PRIX =  10;

    public SeBrancheEnUsb(Appareil appareil) {
        super(appareil, PRIX);
        appareil.ajoutOption(this);
    }
}
