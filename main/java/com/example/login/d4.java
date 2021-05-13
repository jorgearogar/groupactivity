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

public class d4 extends AppCompatActivity {
    Button lg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4);
        lg=(Button)findViewById(R.id.button1);
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(d4.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

