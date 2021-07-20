package com.example.worththeweight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class food extends AppCompatActivity {
    public CardView f1, f2, f3, f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_food);
        f1 = (CardView) findViewById(R.id.f1);
        f2 = (CardView) findViewById(R.id.f2);
        f3 = (CardView) findViewById(R.id.f3);
        f4 = (CardView) findViewById(R.id.f4);

        f1.setOnClickListener(this::onClick);
        f2.setOnClickListener(this::onClick);
        f3.setOnClickListener(this::onClick);
        f4.setOnClickListener(this::onClick);



    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.f1:
                i = new Intent(this, breakfast.class);
                startActivity(i);
                break;

            case R.id.f2:
                i = new Intent(this, lunch.class);
                startActivity(i);
                break;

            case R.id.f3:
                i = new Intent(this, dinner.class);
                startActivity(i);
                break;
            case R.id.f4:
                i = new Intent(this, dessert.class);
                startActivity(i);
                break;

        }
    }
}