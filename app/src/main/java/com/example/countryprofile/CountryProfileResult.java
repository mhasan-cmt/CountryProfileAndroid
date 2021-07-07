package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class CountryProfileResult extends AppCompatActivity {
    private TextView countryName, countryDesc;
    private ImageView countryPicture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile_result);

        countryName=findViewById(R.id.countryName);
        countryDesc=findViewById(R.id.countryDesc);
        countryPicture=findViewById(R.id.countryPic);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String country=bundle.getString("name");
            showData(country);
        }
        else{
            Toast.makeText(this, "Empty..!", Toast.LENGTH_SHORT).show();
        }
    }
    void showData(String country){
        switch(country){
            case "Bangladesh":
                countryName.setText(R.string.btnTextBd);
                countryDesc.setText(R.string.bangladeshDetails);
                countryPicture.setImageResource(R.drawable.bangladesh_place);
                break;
            case "India":
                countryName.setText(R.string.btnTextInd);
                countryDesc.setText(R.string.indiaDetails);
                countryPicture.setImageResource(R.drawable.india_place);
                break;
            case "Pakistan":
                countryName.setText(R.string.btnTextPak);
                countryDesc.setText(R.string.pakistanDetails);
                countryPicture.setImageResource(R.drawable.pakistan_place);
                break;

        }
    }
}