package com.example.kmrad.kawiarnia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    ArrayList<Kawa> kawy = new ArrayList<>();
        kawy.add(new Kawa("Latte", "cena: 15 zł") );
        kawy.add(new Kawa("Cappuccino", "cena: 12 zł") );
        kawy.add(new Kawa("Americano", "cena: 10 zł") );
        kawy.add(new Kawa("Espresso", "cena: 10 zł") );
        kawy.add(new Kawa("Flat White", "cena: 12 zł") );
    }
}
