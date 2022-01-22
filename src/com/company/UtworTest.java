package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Klasa testująca klasę Utwór. <br>
 * Zawiera testy jednostkowe wiekszości metod
 */
class UtworTest {

    /**
     * Sprawdza poprawność tytułu,
     * czy zbyt długi {@link com.company.Utwor#tytul} jest obcinany do 30 znaków
     */
    @Test
    void poprawnoscTytulu() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setTytul("Tytul1234_Tytul1234_Tytul1234_abc");
        Assertions.assertEquals("Tytul1234_Tytul1234_Tytul1234_", utwor.getTytul());
    }

    /**
     * Sprawdza poprawność wykonawcy,
     * czy zbyt długi {@link com.company.Utwor#wykonawca} jest obcinany do 20 znaków
     */
    @Test
    void poprawnoscWykonawcy() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setWykonawca("Wykonawca_Wykonawca_abc");
        Assertions.assertEquals("Wykonawca_Wykonawca_", utwor.getWykonawca());
    }

    /**
     * Sprawdza poprawność czasu,
     * czy ujemny {@link com.company.Utwor#czas} jest zamieniany na 0
     */
    @Test
    void poprawnyCzas() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setCzas(-10);
        Assertions.assertEquals(0, utwor.getCzas());
    }

    /**
     * Sprawdza poprawność konstruktora,
     * czy zbyt długi {@link com.company.Utwor#tytul} jest obcinany do 30 znaków<br>
     * czy ujemny {@link com.company.Utwor#czas} jest zamieniany na 0
     */
    @Test
    void poprawnyKonstruktor() {
        Utwor utwor = new Utwor("Tytul1234_Tytul1234_Tytul1234_abc", -5, 20);
        Assertions.assertEquals("Tytul1234_Tytul1234_Tytul1234_", utwor.getTytul());
        Assertions.assertEquals(0, utwor.getCzas());
        Assertions.assertEquals("nieznany", utwor.getWykonawca());
    }

    /**
     * Sprawdza poprawność czasu w formacie mm:ss
     * czy {@link com.company.Utwor#czas} jest zamieniany 380 sekund to 6:20
     */
    @Test
    void poprawnyCzasTrwania() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setCzas(380);
        Assertions.assertEquals("6:20", utwor.czasTrwania());
    }

    /**
     * Sprawdza poprawność metody toString
     * czy {@link Utwor#toString()} zwróci poprawną wartość
     */
    @Test
    void poprawnoscToString() {
        Utwor utwor = new Utwor("Test piosenki", 5, 20);
        utwor.setWykonawca("Testowy");
        Assertions.assertEquals("Tytuł: Test piosenki, Wykonawca: Testowy, Czas trwania: 5:20", utwor.toString());
    }
}