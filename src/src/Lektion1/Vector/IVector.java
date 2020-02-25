package Lektion1.Vector;

public interface IVector {
    String toString();
    IVector times (double k);
    IVector add (IVector v);
    boolean equals(IVector v);
}


/*    I denne øvelse skal I lave et interface til Vector klassen og derefter lave en klasse som implementerer dette. Vector klassen indeholder en x- og y-værdi og forventes implementeret som en vektor fra matematikkens verden.

        Interface-klassen IVector skal have følgende metoder:
        toString
        times (skal gange vektoren med en konstant)
        add (skal sammenlægge to vektorer)
        equals
        Prøv selv at regne ud hvilke variable metoderne skal tage imod og hvad metoderne skal returnere. Det er helt i orden at tilføje flere metoder til interfacet end de ovenstående.
        Lav nu en Vector klasse som implementerer IVector.
        Lad også Vector implementere Comparable<Vector> og lav en implementation af compareTo metoden. Overvej hvad der definerer om en vektor er mindre eller større end en anden.
        Test nu din compareTo metode ved at indsætte et antal vektorer i et array og bruge metoden Arrays.sort til at sortere dem.
*/