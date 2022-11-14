import java.util.*;

public class Reine extends Fourmie{

    public Reine(){
        super("Reine");
        this.pv=500;
    }

    public String toString(){
        return "La reine avec "+this.pv+" PV";
    }

}