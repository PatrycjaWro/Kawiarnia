package com.example.kmrad.kawiarnia;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kmrad on 04.01.2018.
 */

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {

    ArrayList<Kawa> list = new ArrayList<>();

    CoffeeAdapter(ArrayList<Kawa> kawy) {
        this.list = kawy;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(list.get(position).getName());
        holder.setPrice(list.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.latte)
        TextView Latte;

        @BindView(R.id.cena)
        TextView Cena;

        @OnClick(R.id.button_wybierz)
        void onNameClick(){
            Intent intent = new Intent(itemView.getContext(), MainActivity.class);
            itemView.getContext().startActivity(intent);
        }

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        private void setName(String name) {
            Latte.setText(name);
        }
        private void setPrice(String price) {
            Cena.setText(price);
        }
    }

}
