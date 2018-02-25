package com.razerblade.waskito_1202154223_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS on 24/02/2018.
 */


public class Adapter extends RecyclerView.Adapter<Adapter.MinumanViewHolder>{

    public ArrayList<Item> itemm;

    public Adapter(ArrayList<Item> datas) {
        this.itemm = datas;
    }

    @Override
    public MinumanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_item, parent, false);
        return new MinumanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MinumanViewHolder holder, int position) {
        final Item item = itemm.get(position);
        holder.bindTo(item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(view.getContext().getApplicationContext(),Detail.class);
                go.putExtra("namaa",item.getNama());
                go.putExtra("desc",item.getDeskripsi());
                go.putExtra("img",item.getGambar());
                view.getContext().startActivity(go);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemm.size();
    }

    class MinumanViewHolder extends RecyclerView.ViewHolder{

        private TextView mLblMinumanJudul;
        private TextView mLblMinumanInfo;
        private ImageView mLblMinumanImg;
        private Context mContext;
        private Item mCurrentMinuman;

        public MinumanViewHolder(View itemView) {
            super(itemView);
            mLblMinumanJudul = (TextView)itemView.findViewById(R.id.lblItemJudul);
            mLblMinumanInfo = (TextView)itemView.findViewById(R.id.lblItemDeskripsi);
            mLblMinumanImg = (ImageView)itemView.findViewById(R.id.lblItemImg);
        }

        public void bindTo(Item minuman){
            mCurrentMinuman = minuman;
            mLblMinumanImg.setImageResource(minuman.getGambar());
            mLblMinumanJudul.setText(minuman.getNama());
            mLblMinumanInfo.setText(minuman.getInfo());
        }
    }
}
