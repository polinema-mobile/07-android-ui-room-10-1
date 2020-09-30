package com.example.activitydanintent;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //1 findViewById 5 element id
        TextView namaMhs = (TextView) findViewById(R.id.Nama_mahasiswa);
        TextView nimMhs = (TextView) findViewById(R.id.nim);
        TextView ttl = (TextView) findViewById(R.id.tanggal_lahir);
        TextView gender = (TextView) findViewById(R.id.kelamin);
        TextView jurusan = (TextView)findViewById(R.id.jurusan);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String nim = intent.getStringExtra("NIM");
        String tggl = intent.getStringExtra("TTL");
        String jnskelamin = intent.getStringExtra("GENDER");
        String chosen = intent.getStringExtra("CHOSEN_OPTION");

        namaMhs.setText("NAMA : "+name);
        nimMhs.setText("NIM   : "+nim);
        ttl.setText("TTL   : "+tggl);
        gender.setText("GENDER   : "+jnskelamin);
        jurusan.setText("JURUSAN   : "+chosen);

    }
}