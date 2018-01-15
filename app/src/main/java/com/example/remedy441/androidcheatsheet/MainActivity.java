package com.example.remedy441.androidcheatsheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import ru.katso.livebutton.LiveButton;

public class MainActivity extends AppCompatActivity {

    private LiveButton toMaterial, toVolley, toSQL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar1);

        setSupportActionBar(mToolbar);
        if(getSupportActionBar()!=null) {
            // getSupportActionBar().setDisplayShowHomeEnabled(true);
            // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        getSupportActionBar().setTitle("MainActiviy");

        toMaterial=(LiveButton)findViewById(R.id.butoMaterial);
        toVolley = (LiveButton)findViewById(R.id.butoVolley);

        toMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Material.class));
            }
        });
        toVolley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Volley.class));
            }
        });
    }
}
