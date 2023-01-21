import defaultPackage.*;
import options.RechargeParInduction;
import options.SeBrancheEnUsb;
import options.SurBattrie;

public class Main {

    public static void main(String[] args) {

        FactoryTypeAppareil factory = new FactoryTypeAppareil();
        Appareil quenotte3000 = factory.createAppareil("brosse à dents");
        quenotte3000.setNom("Quenotte3000");

//        quenotte3000 = new RechargeParInduction(quenotte3000);  // 30
//        quenotte3000 = new SurBattrie(quenotte3000);            //20        -> prix options : 50€
//        quenotte3000 = new SeBrancheEnUsb(quenotte3000);        //10

        new RechargeParInduction(quenotte3000);  // 30
        new SurBattrie(quenotte3000);            //20        -> prix options : 60€
        new SeBrancheEnUsb(quenotte3000);        //10

        Piece plateforme = new Piece("plateforme", 390571);
        Piece brosse = new Piece("brosse", 456723, 5);
        Piece manche = new Piece("manche", 568105, 3);
        Piece cable = new Piece("cable", 847207, 5);
        Piece battrie = new Piece("battrie", 189428, 50);
        Piece coque = new Piece("coque", 478392, 2);

        plateforme.add(cable, battrie, coque);      // 5 + 50 + 2 = 57€ -> plateforme
        quenotte3000.ajoutPiece(brosse, manche, plateforme);    // 5 + 3 + 57 = 65€ -> prix pièces



        // pièce + options = 60 + 65 = 125€ au total
        System.out.println("Prix brosse à dent Quennotte 3000 : " + quenotte3000.getPrix() + "€");

        System.out.println("\nPrix des pièces :");
        for(ComponentPiece p : quenotte3000.getLesPieces()){
            System.out.println("Piece brosse à dent Quennotte 3000 : " + p.getNom() + " -> " + p.getPrix() + "€");
        }
        System.out.println("\nPrix des options :");
        for(Option o : quenotte3000.getLesOptions()){
            System.out.println("Options brosse à dent Quennotte 3000 : " + o.monPrix() + "€");
        }
    }
}
