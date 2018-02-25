package com.razerblade.waskito_1202154223_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    private Button btnAdd, btnMin;
    private ImageView progress, lblImg;
    private TextView lblJudul, lblDesc, lblStats;
    private int level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailitem);
        btnAdd = findViewById(R.id.btnIsiTambah);
        btnMin = findViewById(R.id.btnIsiKurang);
        progress = findViewById(R.id.imgIsi);

        lblJudul = findViewById(R.id.lblJudul);
        lblDesc = findViewById(R.id.lblDeskripsi);
        lblImg = findViewById(R.id.lblImg);
        lblStats = findViewById(R.id.lblStatus);

        Intent in = getIntent();
        String nama = in.getStringExtra("namaa");
        String description = in.getStringExtra("desc");
        int imgRes = in.getIntExtra("img", 0);

        setTitle(nama);
        lblJudul.setText(nama);
        lblDesc.setText(description);
        lblImg.setImageResource(imgRes);
        lblStats.setText("" + level + "L");
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (level == 7) {
                    Toast.makeText(Detail.this, "Air Penuh", Toast.LENGTH_SHORT).show();
                    return;
                }
                progress.setImageLevel(level+=1);
                lblStats.setText("" + level + "L");
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (level == 0) {
                    Toast.makeText(Detail.this, "Air Kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                progress.setImageLevel(level-=1);
                lblStats.setText("" + level + "L");
            }
        });
    }
}
