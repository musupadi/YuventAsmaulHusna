package com.example.asmaulhusna.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asmaulhusna.R;

public class DetailAsmaulhusna extends AppCompatActivity {
    TextView nomor,nama,arti,penjelasan,kisah,judulkisah;
    ImageView gambar,kisahgambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_asmaulhusna);

        //Deklarasi Variable
        nomor=(TextView)findViewById(R.id.textnomor);
        nama=(TextView)findViewById(R.id.textnama);
        arti=(TextView)findViewById(R.id.textarti);
        penjelasan=(TextView)findViewById(R.id.textpenjelasan);
        kisah=(TextView)findViewById(R.id.textkisah);
        judulkisah=(TextView)findViewById(R.id.textjudul);
        gambar=(ImageView)findViewById(R.id.gambar);
        kisahgambar=(ImageView)findViewById(R.id.imgkisah);

        //getString
        Intent data = getIntent();
        String Nomor = data.getStringExtra("Nomor");
        String Nama = data.getStringExtra("Nama");
        String Arti = data.getStringExtra("Arti");
        String Penjelasan = data.getStringExtra("Penjelasan");
        String Gambar = data.getStringExtra("Gambar");
        String Suara = data.getStringExtra("Suara");
        String Kisah = data.getStringExtra("Kisah");
        String JudulKisah = data.getStringExtra("JudulKisah");
        String KisahGambar = data.getStringExtra("KisahGambar");

        nomor.setText(Nomor);
        nama.setText(Nama);
        arti.setText(Arti);
        penjelasan.setText(Penjelasan);
        kisah.setText(Kisah);
        judulkisah.setText(JudulKisah);
    }
}
