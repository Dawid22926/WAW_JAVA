package com.glowny.program;
import com.klasy.Przedmiot;
import com.klasy.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź imię studenta: ");
        String imieStudenta = scanner.next();
        System.out.print("Wprowadź nazwisko studenta: ");
        String nazwiskoStudenta = scanner.next();
        System.out.print("Wprowadź numer indeksu studenta: ");
        int indeks = scanner.nextInt();
        var S = new Student(imieStudenta, nazwiskoStudenta, indeks);
        S.pobierzDane();
        System.out.print("Wprowadź ocenę, którą student otrzymał: ");
        Float ocena = scanner.nextFloat();
        S.dodajOcene(ocena);
        S.pobierzDane();
        //----------------------------------
        System.out.print("Wprowadź imię prowadzącego: ");
        String imieProwadzacego = scanner.next();
        System.out.print("Wprowadź nazwisko prowadzącego: ");
        String nazwiskoProwadzacego = scanner.next();
        System.out.print("Wprowadź nazwę przedmiotu: ");
        String nazwaPrzedmiotu = scanner.next();
        var P = new Przedmiot(nazwaPrzedmiotu, imieProwadzacego, nazwiskoProwadzacego);
        P.pobierzDanePrzedmiotu();
        System.out.print("Wprowadź imię nowego prowadzącego: ");
        String imieNowegoProwadzacego = scanner.next();
        System.out.print("Wprowadź nazwisko nowego prowadzącego: ");
        String nazwiskoNowegoProwadzacego = scanner.next();
        P.zmienProwadzacego(imieNowegoProwadzacego, nazwiskoNowegoProwadzacego);
        P.pobierzDanePrzedmiotu();

    }
}
