import java.util.*;
public class Puericultrice extends Fourmie{
    private static int nbPuericultrice;
    private static final String type="Puericultrice";
    private String id;

    public Puericultrice(){
        super(type);
        this.id=Integer.toString(nbPuericultrice++);
    }

    public static int getPuericultrice(){
        return nbPuericultrice;
    }

    public String toString() {
        return type+" numero : "+this.id+" avec "+this.pv+" PV";
    }
}
