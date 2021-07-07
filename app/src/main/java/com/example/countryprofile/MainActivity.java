package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnbd,btnind,btnpak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnbd=findViewById(R.id.btnBd);
        btnind=findViewById(R.id.btnInd);
        btnpak=findViewById(R.id.btnPak);

        btnbd.setOnClickListener(this);
        btnind.setOnClickListener(this);
        btnpak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btnBd){
            Intent intent=new Intent(MainActivity.this,CountryProfileResult.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        } if(v.getId()==R.id.btnInd){
            Intent intent=new Intent(MainActivity.this,CountryProfileResult.class);
            intent.putExtra("name","India");
            startActivity(intent);
        } if(v.getId()==R.id.btnPak){
            Intent intent=new Intent(MainActivity.this,CountryProfileResult.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }
    }
}