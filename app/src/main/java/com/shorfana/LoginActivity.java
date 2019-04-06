package com.shorfana;
/*
    Nama    : Muhammad Iqbal Shorfana
    NIM     : 10116465
    Kelas   : AKB 11 / IF 11
    tanggal : 6 april 2019
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button login;
    TextView kode_keluarga,ketik_kode,punya_kode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        kode_keluarga = (TextView) findViewById(R.id.txt_kode_keluarga);
        ketik_kode = (TextView) findViewById(R.id.txt_ketik_kode);
        punya_kode = (TextView) findViewById(R.id.txt_punya_kode);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        Typeface customfont2=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        Typeface customfont3=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        kode_keluarga.setTypeface(customfont);
        ketik_kode.setTypeface(customfont2);
        punya_kode.setTypeface(customfont3);
        login = (Button)findViewById(R.id.btn_masuk);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent biodata = new Intent(getApplicationContext(), BiodataActivity.class);
                startActivity(biodata);
            }
        });
    }
}
