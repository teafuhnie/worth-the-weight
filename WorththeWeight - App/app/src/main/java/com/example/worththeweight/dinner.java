package com.example.worththeweight;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dinner extends AppCompatActivity {
    public CardView d1,d2,d3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        d1=(CardView)findViewById(R.id.firstdi);
        d2=(CardView)findViewById(R.id.seconddi);
        d3=(CardView)findViewById(R.id.thirddi);


        d1.setOnClickListener(this::onClick);
        d2.setOnClickListener(this::onClick);
        d3.setOnClickListener(this::onClick);

    }


    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.firstdi:
                i=new Intent(this, firstdi.class); startActivity(i);
                break;

            case R.id.seconddi:
                i=new Intent(this, seconddi.class); startActivity(i);
                break;

            case R.id.thirddi:
                i=new Intent(this, thirddi.class); startActivity(i);
                break;
        }
    }
}