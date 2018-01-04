package com.example.kmrad.kawiarnia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Kawa> kawy = new ArrayList<>();
        kawy.add(new Kawa("Latte", "15.00 zł"));
        kawy.add(new Kawa("Cappuccino", "12.00 zł"));
        kawy.add(new Kawa("Americano", "10.00 zł"));
        kawy.add(new Kawa("Espresso", "10.00 zł"));
        kawy.add(new Kawa("Flat White", "12.00 zł"));

        CoffeeAdapter coffeeAdaper = new CoffeeAdapter(kawy);
        recyclerView.setAdapter(coffeeAdaper);
    }
}
