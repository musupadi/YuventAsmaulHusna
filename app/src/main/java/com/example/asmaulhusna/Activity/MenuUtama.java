package com.example.asmaulhusna.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asmaulhusna.Fragment.utama;
import com.example.asmaulhusna.R;

public class MenuUtama extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);
        Fragment fragment=new utama();
        ChangeFragment(fragment);
    }
    private void ChangeFragment (Fragment fragment){
        if(fragment != null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.container,fragment);
            ft.commit();
        }
    }
}
