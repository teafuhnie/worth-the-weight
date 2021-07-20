package com.example.worththeweight;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class breakfast extends AppCompatActivity {
    public CardView b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        b1=(CardView)findViewById(R.id.first);
        b2=(CardView)findViewById(R.id.second);
        b3=(CardView)findViewById(R.id.third);
        b4=(CardView)findViewById(R.id.fourth);

        b1.setOnClickListener(this::onClick);
        b2.setOnClickListener(this::onClick);
        b3.setOnClickListener(this::onClick);
        b4.setOnClickListener(this::onClick);
    }


    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.first:
                i=new Intent(this, first.class); startActivity(i);
                break;

            case R.id.second:
                i=new Intent(this, second.class); startActivity(i);
                break;

            case R.id.third:
                i=new Intent(this, third.class); startActivity(i);
                break;

            case R.id.fourth:
                i=new Intent(this, fourth.class); startActivity(i);
                break;
        }
    }
}