import java.util.*;
public class TestFourmiliere {
    public static void main(String[] args) {
        Fourmilliere f=new Fourmilliere(99);
        System.out.println(f.getElement(1,23).toString());

        Puericultrice p=new Puericultrice();
        Soldate s=new Soldate();

        System.out.println(p);
        p.attaque(s);
        System.out.println(s.getPV());
        System.out.println(p.getPV());

        System.out.println(Fourmie.getNbFourmie());
        f.afficheFourmilliere();

    }
}
