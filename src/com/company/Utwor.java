package com.company;

/**
 * To jest klasa Utwór {@code public class Utwor}
 * Służy do przechowywania <b>utworów</b>, wykonawców i czasu trwania
 * @author Leszek Słowikowski
 * @version 1.0
 */
public class Utwor {
    /**
     * tytuł utworu
     */
    private String tytul;
    /**
     * wykonawca utworu
     */
    private String wykonawca;
    /**
     * czas trwania utworu
     */
    private int czas;

    /**
     * Konstruktor klasy Utwór, ustawia początkowe wartości tytulu i czasu trwania.<br>
     * W konstruktorze nie ma ustawianego wykonawcy, należy to zrobić za pomocą setWykonawca()
     * @param tytul tytuł utworu
     * @param minuty ile minut trwa utwór
     * @param sekundy ile sekund trwa utwór
     * @see com.company.Utwor#tytul
     * @see com.company.Utwor#czas
     */
    public Utwor(String tytul, int minuty, int sekundy) {
        this.wykonawca = "nieznany";
        setTytul(tytul);
        setCzas(minuty * 60 + sekundy);
    }

    /**
     * Getter do pobierania tytułu utworu
     * @return tytuł utworu
     * @see com.company.Utwor#tytul
     */
    public String getTytul() {
        return tytul;
    }

    /**
     * @deprecated
     * pobiera nazwę tytułu utworu
     * @see com.company.Utwor#getTytul
     * @return zwraca tytuł utworu
     */
    public String pobierzTytul() {
        return tytul;
    }

    /**
     * Ustawia tytuł utworu,
     * sprawdza czy tytuł utworu nie jest dłuższy iż 30 znaków
     * @param tytul tytuł utworu
     * @see com.company.Utwor#getTytul
     * @since ver 1.1
     */
    public void setTytul(String tytul) {
        if (tytul.length() > 30)
            this.tytul = tytul.substring(0, 30);
        else this.tytul = tytul;
    }

    /**
     * Getter do pobierania wykonawcy utworu
     * @return wykonwcę utworu
     * @see com.company.Utwor#wykonawca
     */
    public String getWykonawca() {
        return wykonawca;
    }

    /**
     * Setter do ustawiania wykonawcy utworu
     * @param wykonawca utworu
     * @see com.company.Utwor#wykonawca
     */
    public void setWykonawca(String wykonawca) {
        if (wykonawca.length() > 20)
            this.wykonawca = wykonawca.substring(0, 20);
        else this.wykonawca = wykonawca;
    }

    /**
     * Getter pobierający czas trwania utworu
     * @return {@link com.company.Utwor#czas} trwania utworu w sekundach
     */
    public int getCzas() {
        return czas;
    }

    /**
     * Setter ustawiający czas
     * @param czas {@link com.company.Utwor#czas} trwania utworu w sekundach
     */
    public void setCzas(int czas) {
        if (czas < 0)
            this.czas = 0;
        else this.czas = czas;
    }

    /**
     * Zawraca czas trwania w formacie mm:ss
     * @return {@link com.company.Utwor#czas} trwania utworu w minutach i sekundach
     */
    public String czasTrwania() {
        int minuty = czas / 60;
        int sekundy = czas % 60;
        return minuty + ":" + sekundy;
    }

    /**
     * nadpisana metoda toString
     * @return opis całego utworu: tytuł, wykonawcę i czas trwania w formacie mm:ss
     */
    @Override
    public String toString() {
        return "Tytuł: " + tytul + ", " +
                "Wykonawca: " + wykonawca + ", " +
                "Czas trwania: " + czasTrwania();
    }
}
