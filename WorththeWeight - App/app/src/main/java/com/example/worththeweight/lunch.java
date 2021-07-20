package com.example.worththeweight;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lunch extends AppCompatActivity {
    public CardView l1,l2,l3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        l1=(CardView)findViewById(R.id.firstlu);
        l2=(CardView)findViewById(R.id.secondlu);
        l3=(CardView)findViewById(R.id.thirdlu);


        l1.setOnClickListener(this::onClick);
        l2.setOnClickListener(this::onClick);
        l3.setOnClickListener(this::onClick);

    }


    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.firstlu:
                i=new Intent(this, firstlu.class); startActivity(i);
                break;

            case R.id.secondlu:
                i=new Intent(this, secondlu.class); startActivity(i);
                break;

            case R.id.thirdlu:
                i=new Intent(this, thirdlu.class); startActivity(i);
                break;
        }
    }
}