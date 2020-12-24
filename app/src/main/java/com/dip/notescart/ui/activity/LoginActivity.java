package com.dip.notescart.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.dip.notescart.R;
import com.dip.notescart.ui.model.AcademyDetails;

public class LoginActivity extends AppCompatActivity {
    Spinner semester,branch,college;
    Button google,facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        google=(Button)findViewById(R.id.button_google);
        facebook=(Button)findViewById(R.id.button_facebook);

        semester=(Spinner)findViewById(R.id.spinnersem);
        branch=(Spinner)findViewById(R.id.spinnerbranch);
        college=(Spinner)findViewById(R.id.spinnercollege);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String >(this,R.layout.simple_spinner_dropdown, AcademyDetails.Semester);
        semester.setAdapter(adapter1);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String >(this,R.layout.simple_spinner_dropdown, AcademyDetails.Branch);
        branch.setAdapter(adapter2);
        ArrayAdapter<String> adapter3=new ArrayAdapter<String >(this,R.layout.simple_spinner_dropdown, AcademyDetails.College);
        college.setAdapter(adapter3);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}