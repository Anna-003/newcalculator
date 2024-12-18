package com.example.newcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Division extends AppCompatActivity {
    Button b9;
    EditText e1,e2;
    String getNum1,getNum2,result;
    Integer num1,num2,sum;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);
        b9=(Button)findViewById(R.id.dddid);
        e1=(EditText)findViewById(R.id.edit111);
        e2=(EditText)findViewById(R.id.edit222);
        tv=(TextView)findViewById(R.id.result1);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=e1.getText().toString();
                getNum2=e2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1/num2;
                result=String.valueOf(sum);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

    }
}