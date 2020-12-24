package com.dip.notescart.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.dip.notescart.R;
import com.dip.notescart.ui.model.AcademyDetails;

import static com.dip.notescart.R.layout.simple_spinner_dropdown;

public class Notes extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_notes, container, false);

        Spinner semester=(Spinner)v.findViewById(R.id.spinnersem);
        Spinner branch=(Spinner)v.findViewById(R.id.spinnerbranch);
        Spinner college=(Spinner)v.findViewById(R.id.spinnercollege);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String >(getContext(), simple_spinner_dropdown, AcademyDetails.Semester);
        semester.setAdapter(adapter1);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String >(getContext(), simple_spinner_dropdown, AcademyDetails.Branch);
        branch.setAdapter(adapter2);
        ArrayAdapter<String> adapter3=new ArrayAdapter<String >(getContext(), simple_spinner_dropdown, AcademyDetails.College);
        college.setAdapter(adapter3);
        return v;
    }
}