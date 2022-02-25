package navigation;

import voyage.Voyageur;
import voyage.Lieu;
/** Classe permettant la représentation d'un Marinier.
 * Un Marinier est un voyageur qui ne passe que part des Lieux qui sont des Ports.
 */
public class Marinier extends Voyageur {
    /** Constructeur de la classe Marinier
     * @param Port p Son Port d'attache.
     */
    public Marinier(Port p) {
        super(p, p);
    }

    /** Méthode renvoyant vrai si le score du marinier est supérieur à 3.
     * @return true si le score est supérieur à 3, sinon false.
     */
    public boolean joyeux(){
        return this.score() > 3;
    }

    /** Redéfinition des méthodes de la super-classe Voyageur afin de les adapter à la classe Marinier
     * Changements: 
     * - Les méthodes de déplacement sont redéfinies pour que le Marinier ne puisse pas se déplacer sur un lieu qui n'est pas un Port.
     * - Impossibilité dechanger ou supprimer son Port d'attache (Premier Port).
     */

     /** Méthode permettant de changer le Lieu d'une étape
      * @param i Numéro de l'étape à changer.
      * @param lieu Lieu à changer.
      */
    public void changerEtape(int i, Lieu lieu) {
        if (lieu instanceof Port && i > 0) {
            this.etapes[i] = lieu;
        }
    }

    /** Méthode permettant de supprimer une étape
     * @param numero L'indice de l'étape à supprimer.
     */
    public void retirerEtape(int numero) {
        if (numero > 0) {
            this.etapes[numero] = null;
        }
    }

    /** Méthode permettant de supprimer plusieurs étapes
     * @param numeros L'indice de l'étape à supprimer.
     */
    public void retirerEtapes(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                this.etapes[numeros[i]] = null;
            }
        }
    }

}
