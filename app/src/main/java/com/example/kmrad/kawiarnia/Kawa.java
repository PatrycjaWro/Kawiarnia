package com.example.kmrad.kawiarnia;

/**
 * Created by kmrad on 03.01.2018.
 */

public class Kawa {
    private String nazwa;
    private String cena;

    public Kawa(String nazwa, String cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public String getName() {
        return this.nazwa;
    }

    public void setName(String name) {
        this.nazwa = name;
    }

    public String getPrice() {
        return this.cena;
    }

    public void setPrice(String price) {
        this.cena = price;
    }

}
