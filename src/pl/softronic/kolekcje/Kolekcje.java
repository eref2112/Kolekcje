package pl.softronic.kolekcje;

import pl.softronic.kolekcje.klasypomocnicze.Ksiazka;
import java.util.Vector;

public class Kolekcje {

    void testujKolekcje(){
        testujVector();
    }

    private void testujVector() {
        //Na razie nie parametryzujemy - przyjmuje wszystko jak leci
        Vector lista = new Vector();

        String zm1 = "jakiś tekst";
        Float zm2 = 12f;
        Ksiazka ks = new Ksiazka(1, "Przygody","Marek Michałowski");

        lista.add(zm1);
        lista.add(zm2);
        lista.add(null);
        lista.add(ks);

        System.out.println("Liczba elementów: " + lista.size());
    }
}
