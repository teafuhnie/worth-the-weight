package com.example.worththeweight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class exercises extends AppCompatActivity {
    public CardView e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_exercises);
        e1=(CardView)findViewById(R.id.arms);
        e2=(CardView)findViewById(R.id.legs);
        e3=(CardView)findViewById(R.id.chest);
        e4=(CardView)findViewById(R.id.abs);

        e1.setOnClickListener(this::onClick);
        e2.setOnClickListener(this::onClick);
        e3.setOnClickListener(this::onClick);
        e4.setOnClickListener(this::onClick);
    }
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.arms:
                i=new Intent(this, arms.class); startActivity(i);
                break;

            case R.id.legs:
                i=new Intent(this, legs.class); startActivity(i);
                break;

            case R.id.chest:
                i=new Intent(this, chest.class); startActivity(i);
                break;

            case R.id.abs:
                i=new Intent(this, abs.class); startActivity(i);
                break;
        }
    }
}