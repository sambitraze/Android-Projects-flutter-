package com.decodebros.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.SharedPreferences;

import android.os.Bundle;
import android.widget.TextView;

public class LoadProfile extends AppCompatActivity {

    TextView dname,dyear, dcollege, dlocation, dbranch;
    account acc = new account(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadprofile);

        dname = findViewById(R.id.dname);
        dbranch = findViewById(R.id.dbranch);
        dlocation = findViewById(R.id.dlocation);
        dcollege = findViewById(R.id.dcollege);
        dyear = findViewById(R.id.dyear);

        SharedPreferences sharedPreferences = getSharedPreferences("com.decodebros.myapplication", Context.MODE_PRIVATE);

        acc.name = sharedPreferences.getString("name", "default value");
        acc.college = sharedPreferences.getString("college", "default value");
        acc.department = sharedPreferences.getString("department", "default value");
        acc.year = sharedPreferences.getString("year", "default value");
        acc.location = sharedPreferences.getString("location", "default value");

        dname.setText(acc.name);
        dyear.setText(acc.year + " year");
        dcollege.setText(acc.college);
        dlocation.setText(acc.location);
        dbranch.setText(acc.department);
    }
}
