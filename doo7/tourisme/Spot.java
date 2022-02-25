package tourisme;

import voyage.Lieu;


public class Spot extends Lieu {

    private int MIN = 0;
    private static int MAX = 5;
    private int etoiles;

    /**
     * /** Constructeur de Spot.
     * @param nom Nom du Spot.
     * @param etoiles Étoiles du Spot.
     */
    public Spot(String nom, int etoiles) {
        super(nom);
        this.etoiles = etoiles;
    }

    /**
     *  une méthode toString : le nom du lieu suffixé par autant de caractères '*' qu'il y a d'étoiles (exemple : Mirecourt**)
     * @param s
     */
    public String toString() {
        String s = super.toString();
        for (int i = 0; i < this.etoiles; i++) {
            s += "*";
        }
        return s;
    }    
    
    /**
     * une méthode score retournant le nombre d'étoiles.
     * @return etoiles
     */
    
    public int score() {
        return this.etoiles;
    }

    /**
     * une méthode declassement retournant le lieu correspondant au spot sans étoile.
     * @return lieu
     */
    public Lieu declassement() {
        etoiles = 0;
        return this;
    }
    
    /**
     * un constructeur prenant un lieu en paramètre et lui ajoutant une étoile.
     * Un spot avec une étoile est retourné dans le cas d'un simple lieu.
     *  Si le lieu est un spot avec déjà quatre étoiles, aucune étoile supplémentaire n'est ajoutée.
     * @param l
     * @return lieu
     */
    public static Spot ajoutEtoile(Lieu l) {
        if (l instanceof Spot) {
            Spot s = (Spot) l;
            if (s.etoiles < MAX) {
                s.etoiles++;
            }
            return s;
        } else {
            return new Spot(l.toString(), 1);
        }
    }

    /** Méthode qui renvoie vrai si le Spot s a le même nom et le même nombre d'étoiles
     * @param s Spot à comparer.
     * @return Vrai si les deux spots sont identiques, faux sinon.
     */
    public boolean equals(Spot s) {
        return (this.toString().equals(s.toString()) && this.etoiles == s.etoiles);
    }
    

}
