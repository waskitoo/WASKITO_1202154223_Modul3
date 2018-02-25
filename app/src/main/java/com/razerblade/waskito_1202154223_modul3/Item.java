package com.razerblade.waskito_1202154223_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by ASUS on 24/02/2018.
 */

public class Item {
    private String nama, info, deskripsi;
    private int gambar;

    public Item(String nama, String info, String deskripsi, int gambar) {
        this.nama = nama;
        this.info = info;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public static Intent toClick(Context context, String namaa, String desc, @DrawableRes int img){
        Intent in = new Intent(context, Detail.class);
        in.putExtra("namaa",namaa);
        in.putExtra("desc",desc);
        in.putExtra("img",img);
        return in;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
