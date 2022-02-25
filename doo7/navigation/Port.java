package navigation;

import voyage.Lieu;

/** 
 * Class permettant la représentation d'un Port, un Lieu où coule une rivière navigable.
 * 
 */
public class Port extends Lieu {

    String riviere;
    /**
     * Constructeur de la classe Port.
     * @param nom Nom du port.
     * @param code Code postal du port.
     * @param riviere Nom de la rivière navigable.
     */
    public Port(String nom, int code, String riviere) {
        super(nom, code);
        this.riviere = riviere;
    }

    /** Constructeur de la classe Port sans code postal
     * @param nom Nom du port.
     * @param riviere Nom de la rivière navigable.
     */
    public Port(String nom, String riviere) {
        super(nom, 00000);
        this.riviere = riviere;
    }

    /** Méthode permettant de comparer les rivières de deux Ports
     * @param p Port à comparer.
     * @return true si les deux ports sont situés sur la même rivière, sinon false.
     */
    public boolean memeRiviere(Port p) {
        return this.riviere.equals(p.riviere);
    }

    /** Méthode toString
     * @return Le nom du Port, ainsi que le nom de la rivière, le tout relié par '-sur-'.
     */
    public String toString() {
        return super.toString() + "-sur-" + riviere;
    }
}