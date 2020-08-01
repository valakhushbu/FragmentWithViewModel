package com.example.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidbasics.fragmenttab.FragmentTab;
import com.example.androidbasics.fragmentviewmodel.MainActivity;

public class HomePage extends AppCompatActivity {

    TextView txt_one,txt_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        txt_one = findViewById(R.id.txt_one);
        txt_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(HomePage.this, FragmentTab.class);
                startActivity(i);
            }
        });

        txt_two = findViewById(R.id.txt_two);
        txt_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(HomePage.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
