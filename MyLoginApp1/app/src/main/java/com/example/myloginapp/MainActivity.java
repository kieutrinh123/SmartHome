package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        // admin and admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    //correct
                    //Toast.makeText(MainActivity.this, "Đăng nhập thành công",Toast.LENGTH_SHORT).show();

                    Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(myIntent);

                }
                else
                    // incorrect
                    Toast.makeText(MainActivity.this, "Đăng nhập không thành công!!!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}