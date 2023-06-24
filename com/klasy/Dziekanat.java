package com.klasy;

import java.util.ArrayList;

public class Dziekanat {
    int iloscPracownikow;

    public int getIloscPracownikow() {
        return iloscPracownikow;
    }

    public void setIloscPracownikow(int iloscPracownikow) {
        this.iloscPracownikow = iloscPracownikow;
    }

    public Dziekanat(int iloscPracownikow){
        setIloscPracownikow(iloscPracownikow);
    }

    /**
     * metoda usuwająca studenta z listy studentów
     */
    public ArrayList<Integer> usunStudenta(int indeks, ArrayList<Integer> l){
        l.remove(Integer.valueOf(indeks));
        return l;
    }
}
