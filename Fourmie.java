import java.util.*;
public class Fourmie{
    private static int compteur=0;
    protected int pv;
    private final static int PV=100;
    private String type;
    private final static int DEGATATTAQUE=50;

    public Fourmie(String type){
        compteur++;
        this.pv=PV;
        this.type=type;
    }

    public int getPV(){
        return this.pv;
    }

    public static int getNbFourmie(){
        return compteur;
    }

    public String toString() {
        return "Fourmie [pv=" + pv + ", type=" + type + "]";
    }

    public void attaque(Fourmie f1){
        if(this.pv>f1.pv && Math.random()<0.1){
            f1.pv-=DEGATATTAQUE;
        }
        else{this.pv-=DEGATATTAQUE;}
    }
    
    public boolean estMort(){
        return this.pv<0;
    }
    
}