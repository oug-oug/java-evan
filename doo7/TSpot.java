import tourisme.Spot;
import voyage.Lieu;

public class TSpot extends Spot
{
    public TSpot (String nom, int nb)
    {
        super (nom, nb);
    }

    public static void main (String[] args)
    {
        System.out.println ();
        Spot s1 = new TSpot ("La Roche sur Gnon", 3);
        System.out.println ("Test du constructeur et du score");
        System.out.println ("S1 : La Roche sur Gnon***, score = 3");
        System.out.println ("S1 : " + s1 + ", score = " + s1.score ());

        System.out.println ();
        Spot s2 = new Spot (s1);
        System.out.println ("Test du constructeur par recopie");
        System.out.println ("S2 : La Roche sur Gnon****, score = 4");
        System.out.println ("S2 : " + s2 + ", score = " + s2.score ());

        System.out.println ();
        Lieu l1 = s1.declassement ();
        System.out.println ("Test du declassement");
        System.out.println ("L1 : La Roche sur Gnon");
        System.out.println ("L1 : " + l1);

        System.out.println ();
        Spot s3 = new Spot (l1);
        System.out.println ("Test du constructeur a partir d'un lieu");
        System.out.println ("S3 : La Roche sur Gnon*, score = 1");
        System.out.println ("S3 : " + s3 + ", score = " + s3.score ());

    }
}