package com.testy;

import com.klasy.Dziekanat;
import com.klasy.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * klasa testująca
 */
public class Testy {
    @Test
    public void testDodawaniaOceny(){
        Student S = new Student("Marcin", "Najman", 12345);
        S.dodajOcene(2F);
        Assert.assertTrue(S.getOceny().size() == 1);
    }
    @Test
    public void testDodawaniaOceny2(){
        Student S = new Student("Marcin", "Najman", 12345);
        S.dodajOcene(2F);
        Assert.assertTrue(S.getOceny().get(0) == 2.0);
    }
    @Test
    public void testUsuwaniaStudenta(){
        Dziekanat D = new Dziekanat(15);
        ArrayList<Integer> studenci = new ArrayList<Integer>();
        studenci.add(134);
        studenci.add(123);
        studenci.add(111);
        D.usunStudenta(123, studenci);
        Assert.assertTrue(studenci.size() == 2);
        }
    @Test
    public void testUsuwaniaStudenta2(){
        Dziekanat D = new Dziekanat(15);
        ArrayList<Integer> studenci = new ArrayList<Integer>();
        studenci.add(134);
        studenci.add(123);
        studenci.add(111);
        D.usunStudenta(123, studenci);
        Assert.assertTrue(studenci.get(1) == 111);
    }
    @Test
    public void testUsuwaniaStudenta3(){
        Dziekanat D = new Dziekanat(15);
        ArrayList<Integer> studenci = new ArrayList<Integer>();
        studenci.add(134);
        studenci.add(123);
        studenci.add(111);
        D.usunStudenta(123, studenci);
        Assert.assertTrue(studenci.get(0) == 134);
    }
    @Test
    public void testUsuwaniaStudenta4(){
        Dziekanat D = new Dziekanat(15);
        ArrayList<Integer> studenci = new ArrayList<Integer>();
        studenci.add(134);
        studenci.add(123);
        studenci.add(111);
        D.usunStudenta(123, studenci);
            Assert.assertFalse(studenci.contains(123));
    }
    }

