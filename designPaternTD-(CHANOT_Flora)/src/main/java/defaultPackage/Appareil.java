package defaultPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appareil extends ComponentPiece {

    private double supplemmentPrix = 0;     // supplemmentPrix = main d'oeuvre + marge + ...
    private List<ComponentPiece> lesPieces = new ArrayList<>();
    private List<Option> lesOptions = new ArrayList<>();

    public void ajoutPiece(Piece... pieces){
        lesPieces.addAll(Arrays.asList(pieces));
    }

    public void ajoutOption(Option option){
        lesOptions.add(option);
    }

    @Override
    public double getPrix() {
        double somme = supplemmentPrix;

        for(ComponentPiece p : lesPieces){
            somme += p.getPrix();
        }

        for(Option o : lesOptions){
            somme += o.prix;
        }

        return somme;
    }

    public double getSupplemmentPrix() {
        return supplemmentPrix;
    }

    public void setSupplemmentPrix(double supplemmentPrix) {
        this.supplemmentPrix = supplemmentPrix;
    }

    public List<ComponentPiece> getLesPieces() {
        return lesPieces;
    }

    public void setLesPieces(List<ComponentPiece> lesPieces) {
        this.lesPieces = lesPieces;
    }

    public List<Option> getLesOptions() {
        return lesOptions;
    }

    public void setLesOptions(List<Option> lesOptions) {
        this.lesOptions = lesOptions;
    }
}
