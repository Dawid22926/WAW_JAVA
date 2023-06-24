package com.choromanski;

import java.util.List;

public class Student {
String imie;
String nazwisko;
List<Float> oceny;
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

        public List<Float> getOceny() {
                return oceny;
        }

        public void setOceny(List<Float> oceny) {
                this.oceny = oceny;
        }

        public Student(String imie, String nazwisko, int indeks){
                setImie(imie);
                setNazwisko(nazwisko);
                setIndeks(indeks);
        }
        public void pobierzDane(){
                System.out.println("Imię: " + getImie());
                System.out.println("Nazwisko: " + getNazwisko());
                System.out.println("Indeks: " + getIndeks());
        }
}
