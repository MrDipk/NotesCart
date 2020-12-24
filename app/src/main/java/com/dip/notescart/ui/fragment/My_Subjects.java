package com.dip.notescart.ui.fragment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dip.notescart.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class My_Subjects extends Fragment {

    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_my__subjects, container, false);
        final FloatingActionButton fab =v.findViewById(R.id.fab);
        final CardView cvaddsub=v.findViewById(R.id.cardaddsubject);
        final Button done=v.findViewById(R.id.button_done);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    cvaddsub.setVisibility(View.VISIBLE);
                    fab.setVisibility(View.INVISIBLE);
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvaddsub.setVisibility(View.INVISIBLE);
                fab.setVisibility(View.VISIBLE);
            }
        });
        return v;
    }

}