import java.util.*;
public class Soldate extends Fourmie{
    private static int nbSoldates;
    private static final String type="Soldate";
    private String id;

    public Soldate(){
        super(type);
        this.id=Integer.toString(nbSoldates++);
    }

    public static int getNbsoldates(){
        return nbSoldates;
    }
    public String toString() {
        return type+" numero "+this.id+" avec "+this.pv+" PV";
    }
}