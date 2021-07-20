package com.example.worththeweight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dessert extends AppCompatActivity {
    public CardView de1,de2,de3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        de1=(CardView) findViewById(R.id.firstdes);
        de2=(CardView)findViewById(R.id.seconddes);
        de3=(CardView)findViewById(R.id.thirddes);

        de1.setOnClickListener(this::onClick);
        de2.setOnClickListener(this::onClick);
        de3.setOnClickListener(this::onClick);
    }


    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.firstdes:
                i=new Intent(this, firstdes.class); startActivity(i);
                break;

            case R.id.seconddes:
                i=new Intent(this, seconddes.class); startActivity(i);
                break;

            case R.id.thirddes:
                i=new Intent(this, thirddes.class); startActivity(i);
                break;
        }
    }
    }