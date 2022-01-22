package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtworTest {

    @Test
    void poprawnoscTytulu() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setTytul("Tytul1234_Tytul1234_Tytul1234_abc");
        Assertions.assertEquals("Tytul1234_Tytul1234_Tytul1234_", utwor.getTytul());
    }

    @Test
    void poprawnoscWykonawcy() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setWykonawca("Wykonawca_Wykonawca_abc");
        Assertions.assertEquals("Wykonawca_Wykonawca_", utwor.getWykonawca());
    }

    @Test
    void poprawnyCzas() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setCzas(-10);
        Assertions.assertEquals(0, utwor.getCzas());
    }

    @Test
    void poprawnyKonstruktor() {
        Utwor utwor = new Utwor("Tytul1234_Tytul1234_Tytul1234_abc", -5, 20);
        Assertions.assertEquals("Tytul1234_Tytul1234_Tytul1234_", utwor.getTytul());
        Assertions.assertEquals(0, utwor.getCzas());
        Assertions.assertEquals("nieznany", utwor.getWykonawca());
    }

    @Test
    void poprawnyCzasTrwania() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setCzas(380);
        Assertions.assertEquals("6:20", utwor.czasTrwania());
    }

    @Test
    void poprawnoscToString() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setWykonawca("Testowy");
        Assertions.assertEquals("Tytuł: Test piosenki, Wykonawca: Testowy, Czas trwania: 5:20", utwor.toString());
    }
}