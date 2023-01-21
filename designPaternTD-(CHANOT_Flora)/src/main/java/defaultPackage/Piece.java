package defaultPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Piece extends ComponentPiece {

    private double prix;
    private List<ComponentPiece> children = new ArrayList<>();

    public Piece(String nom, int codeProduit, double prix) {
        super(nom, codeProduit);
        this.prix = prix;
    }

    public Piece(String nom, int codeProduit) {
        super(nom, codeProduit);
    }

    @Override
    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix){
        this.prix = prix;
    }

    public void add(ComponentPiece... pieces){
        for(ComponentPiece p : pieces){
            prix += p.getPrix();
        }
        children.addAll(Arrays.asList(pieces));
    }

    public void remove(ComponentPiece... pieces){
        for(ComponentPiece p : pieces){
            prix -= p.getPrix();
        }
        children.removeAll(Arrays.asList(pieces));
    }
}
