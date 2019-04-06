package com.shorfana;
/*
    Nama    : Muhammad Iqbal Shorfana
    NIM     : 10116465
    Kelas   : AKB 11 / IF 11
    tanggal : 6 april 2019
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {

    EditText isi_Nama,isi_Umur;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        isi_Nama = (EditText) findViewById(R.id.nama);
        isi_Umur = (EditText) findViewById(R.id.umur);
        btn_next = (Button) findViewById(R.id.btn_selanjutnya);

        final String NAME = "kamu";

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = isi_Nama.getText().toString();
                String umur = isi_Umur.getText().toString();

                boolean isEmpty = false;
                if(TextUtils.isEmpty(nama)){
                    isEmpty = true;
                    isi_Nama.setError("Isi data nama anda");
                }else if (TextUtils.isEmpty(umur)){
                    isEmpty = true;
                    isi_Umur.setError("Isi data Umur anda");
                }else{
                    Intent selanjutnya = new Intent(BiodataActivity.this, SayHai_Activity.class);
                    selanjutnya.putExtra(NAME,nama);
                    startActivity(selanjutnya);
                }
            }
        });
    }
}
