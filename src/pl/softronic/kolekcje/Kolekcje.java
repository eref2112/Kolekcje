package pl.softronic.kolekcje;

import pl.softronic.kolekcje.klasypomocnicze.Ksiazka;

import java.util.*;

public class Kolekcje {
    public static void main(String[] args) {
        testujKolekcje();
    }

    static void testujKolekcje(){
        //Lista dynamiczna nie implementująca interfejsu Collection
        testujHashTable();

        //Listy dynamiczne implementujące interfejs Collection
        testujListy();
    }

    private static void testujListy() {

        testujVector();
        testujArrayList();
        testujLinkedList();
    }

    private static void testujLinkedList() {
        List ll = new LinkedList<>();

        for (Object el: ll){

        }
    }

    private static void testujArrayList() {
        List al = new ArrayList();

        for (Object el: al){

        }
    }

    private static void testujHashTable() {
        //Nie implementuje interfejsu Collection
        //Na razie nie parametryzujemy - przyjmuje wszystko jak leci
        Hashtable ht = new Hashtable();

        //Ten już tylko Integer i Stringi
        Hashtable<Integer, String> h = new Hashtable();

        String zm1 = "jakiś tekst";
        Float zm2 = 12f;
        Ksiazka ks = new Ksiazka(1, "Przygody","Marek Michałowski");

        ht.put(1, zm1);
        ht.put(2, zm2);
        ht.put(3, null);
        ht.put(4, ks);

        //HashTable nie jest obsługiwane przez pętlę for-each
        //for(Object el: ht){
        //}
    }

    private static void testujVector() {
        //Nie implementuje interfejsu Collection
        //Na razie nie parametryzujemy - przyjmuje wszystko jak leci
        List lista = new Vector();

        //Ten już tylko Stringi
        Vector<String> listaTyp = new Vector<String>();

        String zm1 = "jakiś tekst";
        Float zm2 = 12f;
        Ksiazka ks = new Ksiazka(1, "Przygody","Marek Michałowski");

        lista.add(zm1);
        lista.add(zm2);
        lista.add(null);
        lista.add(ks);

        System.out.println("Liczba elementów: " + lista.size());

        listaTyp.add(zm1);
        //listaTyp.add(zm2);



    }
}
