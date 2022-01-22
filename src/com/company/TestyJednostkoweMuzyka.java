package com.company;

public class TestyJednostkoweMuzyka {

    public static void main(String[] args) {
        Utwor utwor1 = new Utwor("Przez Twe oczy", 4, 35);
        utwor1.setWykonawca("Zenek Martyniuk");
        System.out.println(utwor1.toString());

        Utwor utwor2 = new Utwor("Do Ani", 3, 50);
        utwor2.setWykonawca("Kult");
        System.out.println(utwor2);
    }
}
