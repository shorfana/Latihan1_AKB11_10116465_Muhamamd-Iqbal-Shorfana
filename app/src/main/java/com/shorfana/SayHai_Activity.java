package com.shorfana;
/*
    Nama    : Muhammad Iqbal Shorfana
    NIM     : 10116465
    Kelas   : AKB 11 / IF 11
    tanggal : 6 april 2019
 */

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SayHai_Activity extends AppCompatActivity {

    final String NAME = "kamu";
    private String nama;
    TextView halo;
    Button oke;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai_);

        halo = (TextView) findViewById(R.id.beres);

        Bundle exBundle = getIntent().getExtras();
        nama = exBundle.getString(NAME);
        halo.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu "+ nama +" ngatur waktu");
        oke = (Button) findViewById(R.id.oke);
        oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }
}
