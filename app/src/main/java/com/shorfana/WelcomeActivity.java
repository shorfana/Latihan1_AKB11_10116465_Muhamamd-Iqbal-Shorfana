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

public class WelcomeActivity extends AppCompatActivity {
    private Button masuk;
    TextView monitor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        monitor=(TextView)findViewById(R.id.monitor);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        monitor.setTypeface(customfont);
        masuk = (Button)findViewById(R.id.btn_masuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(login);
            }
        });
    }

}
