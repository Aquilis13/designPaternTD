package defaultPackage;

public abstract class Option extends Appareil { /* Le décorateur */

    protected double prix;
    protected Appareil appareil;

    public Option(Appareil appareil, double prix) {
        this.appareil = appareil;
        this.prix = prix;
    }

    public double monPrix(){
        return this.prix;
    }
}
