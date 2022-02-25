import navigation.Port;
import voyage.Lieu;

public class TPort extends Port
{
    public TPort (String nom, String riv)
    {
        super (nom, riv);
    }

    public static void main (String[] args)
    {
        System.out.println ();
        TPort p1 = new TPort ("La Roche", new String ("Gnon"));
        System.out.println ("Test du convertisseur en chaine de caracteres ");
        System.out.println ("P1 : La Roche-sur-Gnon : true");
        System.out.println ("P1 : La Roche-sur-Gnon : "
                + p1.toString ().equals ("La Roche-sur-Gnon"));

        System.out.println ();
        System.out.println ("Test des ports sur la meme riviere");
        TPort p2 = new TPort ("La Ruche", new String ("Gnon"));
        System.out.println ("P2 : Meme riviere que P1 : true");
        System.out.println ("P2 : Meme riviere que P1 : " + p2.memeRiviere (p1));

        System.out.println ();
        System.out.println ("Test des ports sur des rivieres differentes");
        TPort p3 = new TPort ("La Ruche", new String ("Gron"));
        System.out.println ("P3 : Meme riviere que P1 : false");
        System.out.println ("P3 : Meme riviere que P1 : " + p3.memeRiviere (p1));
    }
}