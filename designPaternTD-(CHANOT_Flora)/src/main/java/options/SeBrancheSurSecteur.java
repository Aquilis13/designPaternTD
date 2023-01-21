package options;

import defaultPackage.Appareil;
import defaultPackage.Option;

public class SeBrancheSurSecteur extends Option {

    public static final double PRIX =  5;

    public SeBrancheSurSecteur(Appareil appareil) {
        super(appareil, PRIX);
        appareil.ajoutOption(this);
    }
}
