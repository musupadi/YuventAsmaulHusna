package com.example.asmaulhusna.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.asmaulhusna.R;

public class MainActivity extends AppCompatActivity {
    Button clickme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickme=(Button)findViewById(R.id.btnMenuUtama);

        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });
    }
    private void changeActivity(){
        Intent intent = new Intent(this,MenuUtama.class);
        startActivity(intent);
    }
}
