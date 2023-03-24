package com.example.myloginapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText ipxx1;
    private static Button led;

    public static String texr = "192.168.1.245";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        led=(Button) findViewById(R.id.click);
        ipxx1=(EditText) findViewById(R.id.ipadd);

        led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //texr=ipxx1.getText().toString();
                //texr = "192.168.1.245";
                Intent ht1 = new Intent(MainActivity2.this,LED_activity.class);
                startActivity(ht1);
            }
        });
    }
}
