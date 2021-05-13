package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.*;
import android.os.*;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button l;
    EditText u,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(Button)findViewById(R.id.button1);
        u=(EditText) findViewById(R.id.user);
        p=(EditText) findViewById(R.id.pass);

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(u.getText().toString().equals("jorge")&& p.getText().toString().equals("user1")){

                    Intent i1 = new Intent(MainActivity.this,d1.class);
                    startActivity(i1);

                }else if(u.getText().toString().equals("justinejoel")&& p.getText().toString().equals("user2")) {

                    Intent i2 = new Intent(MainActivity.this,d2.class);
                    startActivity(i2);
                }else if(u.getText().toString().equals("luckyjoy")&& p.getText().toString().equals("user3")) {

                    Intent i3 = new Intent(MainActivity.this,d3.class);
                    startActivity(i3);
                }else if(u.getText().toString().equals("mariel")&& p.getText().toString().equals("user4")) {

                    Intent i4 = new Intent(MainActivity.this,d4.class);
                    startActivity(i4);
                }else{
                    Toast.makeText(getApplicationContext(), "Invalid Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
