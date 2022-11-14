import java.util.*;
public class Fourmilliere {
    private Fourmie [][] tab;


    public Fourmilliere(int nbTotaledeFourmie){
        tab=new Fourmie[5][(int)(nbTotaledeFourmie/4)];
        tab[0][0]= new Reine();
        tab[0][1]=null ;//Appel au garbage collector
        for(int i=0;i<(tab[0].length);i++){
                tab[1][i]=new Soldate();
                tab[2][i]=new Exploratrice();
                tab[3][i]=new Puericultrice();
                tab[4][i]=new Agricultrice();
            }
    }


    public Fourmie getElement(int type,int ele){
            return tab[type][ele];
    }

    public void afficheFourmilliere(){
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                System.out.println(tab[i][j]);
            }
            System.out.println();
        }
    }
}
