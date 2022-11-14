public class Fourmie{
    private static int compteur=0;
    protected int pv;
    private final static int PV=100;
    private String type;

    public Fourmie(String type){
        compteur++;
        this.pv=PV;
        this.type=type;
    }


    public String toString() {
        return "Fourmie [pv=" + pv + ", type=" + type + "]";
    }

    
}