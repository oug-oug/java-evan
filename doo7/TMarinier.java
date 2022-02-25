import navigation.Marinier;
import navigation.Port;
import voyage.Lieu;

public class TMarinier extends Marinier
{
    public TMarinier ()
    {
        super (new Port ("La Roche", "Gnon"));
    }

    public static void main (String[] args)
    {
        System.out.println ();
        TMarinier m1 = new TMarinier ();
        System.out.println ("Test du constructeur, du score et de la satisfaction");
        System.out.println ("M1 : <La Roche-sur-Gnon>, score = 1, T");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));

        System.out.println ();
        m1.ajouterEtape (new Lieu ("Labroche Surion"));
        System.out.println ("Test du non ajout d'un simple lieu");
        System.out.println ("M1 : <La Roche-sur-Gnon>, score = 1, T");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));

        System.out.println ();
        System.out.println ("Test de non modification du port d'attache");
        m1.changerEtape (1, new Port ("LR", "Gnon"));
        System.out.println ("M1 : <La Roche-sur-Gnon>, score = 1, T");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));

        System.out.println ();
        m1.ajouterEtape (new Port ("LR", "Gnon"));
        System.out.println ("Test d'ajout d'un nouveau port");
        System.out.println ("M1 : <La Roche-sur-Gnon - LR-sur-Gnon>, score = 2, T");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));

        System.out.println ();
        m1.ajouterEtape (m1.etapes[0], 1);
        System.out.println ("Test de non ajout en premiere etape");
        System.out.println ("M1 : <La Roche-sur-Gnon - LR-sur-Gnon>, score = 2, T");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));

        System.out.println ();
        m1.ajouterEtape (m1.etapes[1]);
        m1.ajouterEtape (m1.etapes[1]);
        System.out.println ("Test de satisfaction");
        System.out.print ("M1 : <La Roche-sur-Gnon - LR-sur-Gnon - LR-sur-Gnon");
        System.out.println (" - LR-sur-Gnon>, score = 4, J");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));

        System.out.println ();
        m1.retirerEtape (1);
        System.out.println ("Test de non retrait du port d'attache");
        System.out.print ("M1 : <La Roche-sur-Gnon - LR-sur-Gnon - LR-sur-Gnon");
        System.out.println (" - LR-sur-Gnon>, score = 4, J");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));

        System.out.println ();
        m1.retirerEtape (2);
        System.out.println ("Test de retrait du deuxieme port");
        System.out.print ("M1 : <La Roche-sur-Gnon - LR-sur-Gnon - LR-sur-Gnon>");
        System.out.println (", score = 3, T");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));

        System.out.println ();
        m1.changerEtape (3, new Port ("Labroche", "Gnon"));
        System.out.println ("Test de modification du dernier port");
        System.out.print ("M1 : <La Roche-sur-Gnon - LR-sur-Gnon ");
        System.out.println ("- Labroche-sur-Gnon>, score = 3, T");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));

        System.out.println ();
        m1.retirerEtape (3);
        System.out.println ("Test du retrait du dernier port");
        System.out.println ("M1 : <La Roche-sur-Gnon - LR-sur-Gnon>, score = 2, T");
        System.out.println ("M1 : " + m1 + ", score = " + m1.score ()
                + (m1.joyeux () ? ", J" : ", T"));
    }
}