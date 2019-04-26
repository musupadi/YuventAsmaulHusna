package com.example.asmaulhusna.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asmaulhusna.Activity.AsmaulHusna;
import com.example.asmaulhusna.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class utama extends Fragment {

    ImageView asmaulhusna;

    public utama() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_utama, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        asmaulhusna=(ImageView)view.findViewById(R.id.img_asmaulhusna);

        asmaulhusna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), AsmaulHusna.class);
                startActivity(intent);
            }
        });
    }
}
