package com.klasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * klasa reprezentująca studenta
 */
public class Student {
String imie;
String nazwisko;
ArrayList<Float> oceny;
int indeks;

        public int getIndeks() {
                return indeks;
        }

        public void setIndeks(int indeks) {
                this.indeks = indeks;
        }

        public String getImie() {
                return imie;
        }

        public void setImie(String imie) {
                this.imie = imie;
        }

        public String getNazwisko() {
                return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
                this.nazwisko = nazwisko;
        }

        public ArrayList<Float> getOceny() {
                return oceny;
        }


        public Student(String imie, String nazwisko, int indeks){
                setImie(imie);
                setNazwisko(nazwisko);
                setIndeks(indeks);
                oceny = new ArrayList<>();
                //this.oceny.clear();
        }

        /**
         * metoda pobierająca wyświetlająca dane o studencie
         */
        public void pobierzDane(){
                System.out.println("Imię: " + getImie());
                System.out.println("Nazwisko: " + getNazwisko());
                System.out.println("Indeks: " + getIndeks());
                if (getOceny().isEmpty()){
                        System.out.println("Oceny: brak");
                }
                else {
                        System.out.println("Oceny: " + getOceny());
                }

        }

        /**
         * metoda dodająca ocenę studentowi
         */
        public List<Float> dodajOcene(Float ocena){
                this.oceny.add(ocena);
                return getOceny();
        }
}
