package com.example.asmaulhusna.Activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.asmaulhusna.Adapter.AdapterAsmaulHusna;
import com.example.asmaulhusna.Model.DataModelAsmaulHusna;
import com.example.asmaulhusna.Model.ModelAsmaulHusna;
import com.example.asmaulhusna.R;

import java.util.ArrayList;
import java.util.List;

public class AsmaulHusna extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<ModelAsmaulHusna> List = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul_husna);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        List.addAll(DataModelAsmaulHusna.getListData());


        Fragment fragment = new Fragment();
        //IF ELSE
        Intent data = getIntent();
        String DetailExtra = data.getStringExtra("DetailExtra");
        String Nomor = data.getStringExtra("Nomor");
        String Nama = data.getStringExtra("Nama");
        String Arti = data.getStringExtra("Arti");
        String Penjelasan = data.getStringExtra("Penjelasan");
        String Gambar = data.getStringExtra("Gambar");
        String Suara = data.getStringExtra("Suara");
        String Kisah = data.getStringExtra("Kisah");
        String JudulKisah = data.getStringExtra("JudulKisah");
        String KisahGambar = data.getStringExtra("KisahGambar");
        if (DetailExtra !=null){
            Intent intent = new Intent();
        }
        //DONE
        ShowData();
    }
    private void ShowData(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterAsmaulHusna adapterAsmaulHusna = new AdapterAsmaulHusna(this);
        adapterAsmaulHusna.setListAsmaulHusna(List);
        recyclerView.setAdapter(adapterAsmaulHusna);
    }
}
