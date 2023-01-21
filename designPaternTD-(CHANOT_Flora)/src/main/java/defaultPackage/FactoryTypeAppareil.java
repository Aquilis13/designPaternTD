package defaultPackage;

import typesAppareils.BrosseADents;
import typesAppareils.CableRj45;
import typesAppareils.MachineALaver;

public class FactoryTypeAppareil {

    public static final String BROSSE_A_DENTS = "brosse à dents";
    public static final String CABLE_RJ_45 = "câble RJ45";
    public static final String MACHINE_A_LAVER = "machine à laver";

    public static Appareil createAppareil(String type){
        Appareil appareil = null;

        switch (type){
            case BROSSE_A_DENTS:
                appareil = new BrosseADents();
                break;
            case CABLE_RJ_45 :
                appareil = new CableRj45();
                break;
            case MACHINE_A_LAVER:
                appareil = new MachineALaver();
                break;
            default :
                throw new IllegalArgumentException ("Type inconnu");
        }

        return appareil;
    }
}
