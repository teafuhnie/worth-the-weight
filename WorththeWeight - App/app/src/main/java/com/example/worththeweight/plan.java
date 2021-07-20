package com.example.worththeweight;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class plan extends AppCompatActivity {
    CalendarView calendar;
    TextView mark, markd;
    Button btnMark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_plan);
        calendar=(CalendarView)findViewById(R.id.calendar);
        mark=(TextView) findViewById(R.id.mark);
        markd=(TextView) findViewById(R.id.markd);
        btnMark=(Button)findViewById(R.id.btnMark);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date=(month+1)+"/"+dayOfMonth+"/"+year;
                mark.setText(date);


            }

        });

        btnMark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md();
            }
        });

    }
    private void md(){
        markd.setText("Workout done!");

    }


    }
