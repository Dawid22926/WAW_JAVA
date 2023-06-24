package com.klasy;

public class Przedmiot {
    String nazwa;
    String imieProwadzacego;
    String nazwiskoProwadzacego;


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getImieProwadzacego() {
        return imieProwadzacego;
    }

    public void setImieProwadzacego(String imieProwadzacego) {
        this.imieProwadzacego = imieProwadzacego;
    }

    public String getNazwiskoProwadzacego() {
        return nazwiskoProwadzacego;
    }

    public void setNazwiskoProwadzacego(String nazwiskoProwadzacego) {
        this.nazwiskoProwadzacego = nazwiskoProwadzacego;
    }
    public void pobierzDanePrzedmiotu() {
        System.out.println("Nazwa Przedmiotu: " + getNazwa());
        System.out.println("Imię Prowadzącego: " + getImieProwadzacego());
        System.out.println("Nazwisko Prowadzącego: " + getNazwiskoProwadzacego());
    }

    public Przedmiot(String nazwa, String imieProwadzacego, String nazwiskoProwadzacego){
        setNazwa(nazwa);
        setImieProwadzacego(imieProwadzacego);
        setNazwiskoProwadzacego(nazwiskoProwadzacego);
    }
    public String[] zmienProwadzacego(String imieNowegoProwadzacego, String nazwiskoNowegoProwadzacego){
        setImieProwadzacego(imieNowegoProwadzacego);
        setNazwiskoProwadzacego(nazwiskoNowegoProwadzacego);
        String[] prowadzacy = new String[2];
        prowadzacy[0] = getImieProwadzacego();
        prowadzacy[1] = getNazwiskoProwadzacego();
        return prowadzacy;

    }
}
