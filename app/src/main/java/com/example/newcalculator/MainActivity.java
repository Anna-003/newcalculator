package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.add);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ab=new Intent(getApplicationContext(),ADD.class);
                        startActivity(ab);
                    }
                });
        b2=(Button) findViewById(R.id.sub);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent an=new Intent(getApplicationContext(),SUBTRACTION.class);
                startActivity(an);
            }
        });
        b3=(Button) findViewById(R.id.mul);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent am=new Intent(getApplicationContext(),Multiplication.class);
                startActivity(am);
            }
        });
        b4=(Button) findViewById(R.id.div);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ad=new Intent(getApplicationContext(),Division.class);
                startActivity(ad);
            }
        });


    }
}