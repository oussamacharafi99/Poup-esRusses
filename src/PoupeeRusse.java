import java.util.Scanner;

public class PoupeeRusse implements Poupee {
    private String NomP;
    private boolean ouverte;
    private int taille;

    PoupeeRusse Doll;

    public PoupeeRusse(String Name, int taille, boolean ouverte) {
        this.ouverte = ouverte;
        this.taille = taille;
        this.NomP = Name;
    }

    @Override
    public void ouvrir() {

        if (ouverte) {
            System.out.println("Cette poupee est deja ouverte !!");
        } else {
            this.setOuverte(true);
            System.out.println("Cette poupee sera ouverte maintenant !!");

        }

    }

    @Override
    public void fermer() {

        if (!getOuverte()) {
            System.out.println("Cette poupee est deja fermer !!");
        } else {
            ouverte = false;
            System.out.println("Cette poupee sera fermer maintenant");
        }

    }

    @Override
    public void placerDans(Poupee p) {
        if (ouverte && this.Doll == null && this.getTaille() > ((PoupeeRusse) p).getTaille()) {
            this.Doll = (PoupeeRusse) p;
            System.out.println("la poupee placer avec succes");
        } else {
            System.out.println("l'operation a echouer");
        }

    }


    @Override
    public void sortirDe(Poupee p) {
        if (ouverte && Doll != null) {

            System.out.println("la poupee sortir avec succes");
            this.Doll = null;

        } else {
            System.out.println("l'operation a echouer");
        }

    }
    public void aficher(){
        System.out.println(" * - Doll Name -->  "+this.getNomP()+"|  Doll Taille -->  "+this.getTaille());
    }


    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public boolean getOuverte() {
        return ouverte;
    }

    public void setOuverte(boolean ouverte) {
        this.ouverte = ouverte;
    }

    public String getNomP() {
        return NomP;
    }

    public void setNomP(String nomP) {
        NomP = nomP;
    }
}
