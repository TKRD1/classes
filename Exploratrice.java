import java.util.*;
public class Exploratrice extends Fourmie {
    private static int nbExploratrices;
    private static final String type="Exploratrice";
    private String id;

    public Exploratrice(){
        super(type);
        this.id=Integer.toString(nbExploratrices++);
    }

    public static int getNbExploratrices(){
        return nbExploratrices;
    }

    public String toString() {
        return type+" numero "+this.id+" avec "+this.pv+" PV";
    }
}
