//Nama    : Muhammad Iqbal Shorfana
//NIM     : 10116465
//Kelas   : AKB 11 / IF 11
//tanggal : 5 april 2019
package com.shorfana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
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
