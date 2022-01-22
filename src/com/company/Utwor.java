package com.company;

public class Utwor {
    private String tytul;
    private String wykonawca;
    private int czas;

    public Utwor(String tytul, int minuty, int sekundy) {
        this.wykonawca = "nieznany";
        setTytul(tytul);
        setCzas(minuty * 60 + sekundy);
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        if (tytul.length() > 30)
            this.tytul = tytul.substring(0, 30);
        else this.tytul = tytul;
    }

    public String getWykonawca() {
        return wykonawca;
    }

    public void setWykonawca(String wykonawca) {
        if (wykonawca.length() > 20)
            this.wykonawca = wykonawca.substring(0, 20);
        else this.wykonawca = wykonawca;
    }

    public int getCzas() {
        return czas;
    }

    public void setCzas(int czas) {
        if (czas < 0)
            this.czas = 0;
        else this.czas = czas;
    }

    public String czasTrwania() {
        int minuty = czas / 60;
        int sekundy = czas % 60;
        return minuty + ":" + sekundy;
    }

    @Override
    public String toString() {
        return "Tytuł: " + tytul + ", " +
                "Wykonawca: " + wykonawca + ", " +
                "Czas trwania: " + czasTrwania();
    }
}
