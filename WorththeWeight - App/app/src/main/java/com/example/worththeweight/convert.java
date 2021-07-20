package com.example.worththeweight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class convert extends AppCompatActivity {

    EditText edFt;
    TextView txtResult;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        edFt = (EditText) findViewById(R.id.edft);
        txtResult=findViewById(R.id.txtresult);
        btnConvert=findViewById(R.id.btnconvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value();
            }
        });

    }
    private void value(){
        String enter=edFt.getText().toString();
        double ft = Double.parseDouble(enter);
        double cm = ft*30.48;
        txtResult.setText("" +cm);

    }

}