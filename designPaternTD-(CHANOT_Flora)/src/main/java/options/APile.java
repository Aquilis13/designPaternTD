package options;

import defaultPackage.Appareil;
import defaultPackage.Option;

public class APile extends Option {
    public static final double PRIX =  5;

    public APile(Appareil appareil) {
        super(appareil, PRIX);
        appareil.ajoutOption(this);
    }
}