package defaultPackage;

public abstract class ComponentPiece {
    private String nom;
    private int codeProduit;

    public ComponentPiece(){
    }

    public ComponentPiece(String nom, int codeProduit) {
        this.nom = nom;
        this.codeProduit = codeProduit;
    }

    abstract public double getPrix();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }
}
