package com.example.asmaulhusna.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.asmaulhusna.Activity.AsmaulHusna;
import com.example.asmaulhusna.Activity.DetailAsmaulhusna;
import com.example.asmaulhusna.Model.ModelAsmaulHusna;
import com.example.asmaulhusna.R;

import java.util.ArrayList;

public class AdapterAsmaulHusna extends RecyclerView.Adapter<AdapterAsmaulHusna.CategoryViewHolder> {
    private Context context;
    private ArrayList<ModelAsmaulHusna> listAsmaulHusna;

    private ArrayList<ModelAsmaulHusna> getListAsmaulHusna() {
        return listAsmaulHusna;
    }

    public void setListAsmaulHusna(ArrayList<ModelAsmaulHusna> listAsmaulHusna) {
        this.listAsmaulHusna = listAsmaulHusna;
    }

    public AdapterAsmaulHusna(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listasmaulhusna, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.Nomor.setText(getListAsmaulHusna().get(position).getNomor());
        categoryViewHolder.Nama.setText(getListAsmaulHusna().get(position).getNama());
        categoryViewHolder.Arti.setText(getListAsmaulHusna().get(position).getArti());
        Glide.with(context)
                .load(getListAsmaulHusna().get(position).getGambar())
                .into(categoryViewHolder.Gambar);
        categoryViewHolder.list.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent goInput = new Intent(context, DetailAsmaulhusna.class);
                goInput.putExtra("DetailExtra","AsmaulHusna");
                goInput.putExtra("Nomor",getListAsmaulHusna().get(position).getNomor());
                goInput.putExtra("Nama",getListAsmaulHusna().get(position).getNama());
                goInput.putExtra("Arti",getListAsmaulHusna().get(position).getArti());
                goInput.putExtra("Gambar",getListAsmaulHusna().get(position).getGambar());
                goInput.putExtra("Kisah",getListAsmaulHusna().get(position).getKisah());
                goInput.putExtra("JudulKisah",getListAsmaulHusna().get(position).getJudulkisah());
                goInput.putExtra("Penjelasan",getListAsmaulHusna().get(position).getPenjelasan());
                goInput.putExtra("Suara",getListAsmaulHusna().get(position).getSuara());
                goInput.putExtra("KisahGambar",getListAsmaulHusna().get(position).getKisahGambar());
                context.startActivities(new Intent[]{goInput});
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListAsmaulHusna().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView Nomor, Nama, Arti;
        ImageView Gambar;
        LinearLayout list;


        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            Nomor=(TextView)itemView.findViewById(R.id.textnomor);
            Nama=(TextView)itemView.findViewById(R.id.textnama);
            Arti=(TextView)itemView.findViewById(R.id.textarti);
            Gambar=(ImageView)itemView.findViewById(R.id.ImgAsmaulHusna);
            list=(LinearLayout)itemView.findViewById(R.id.listAsmaulHusna);
        }
    }
}
