package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button b1,b2,b3,b4,b5,b6,b7;
 TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1 = (TextView) findViewById(R.id.textView3);
        t2 = (TextView) findViewById(R.id.textView4);
         t3=(TextView)findViewById(R.id.textView5);
        b1 = (Button) findViewById(R.id.button6);
        b2=(Button) findViewById(R.id.button7);
        b3=(Button) findViewById(R.id.button8);
        b4=(Button) findViewById(R.id.button9);
        b5=(Button) findViewById(R.id.button10);
        b6=(Button) findViewById(R.id.button11);
        b7=(Button) findViewById(R.id.button12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=t1.getText().toString();
                String value2=t2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                t3.setText(Integer.toString(sum));
            }



        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=t1.getText().toString();
                String value2=t2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a-b;
                t3.setText(Integer.toString(sum));
            }



        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=t1.getText().toString();
                String value2=t2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a*b;
                t3.setText(Integer.toString(sum));
            }



        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=t1.getText().toString();
                String value2=t2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a/b;
                t3.setText(Integer.toString(sum));
            }



        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=t1.getText().toString();
                String value2=t2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a%b;
                t3.setText(Integer.toString(sum));
            }



        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=t1.getText().toString();
                String value2=t2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a*a;
                t3.setText(Integer.toString(sum));
            }



        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                 t2.setText("");
                  t3.setText("");
            }



        });


    }}
