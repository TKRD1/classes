import java.util.*;
public class Agricultrice extends Fourmie {
    private static int nbAgricultrice;
    private static final String type="Agricultrice";
    private String id;


    public Agricultrice(){
        super(type);
        id=Integer.toString(nbAgricultrice++);
    }

    public static int getNbAgricultrice() {
        return nbAgricultrice;
    }

    public String toString() {
        return type+" numero "+this.id+" avec "+this.pv+" PV";
    }

    
}
