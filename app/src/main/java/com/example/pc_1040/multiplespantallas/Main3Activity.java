package com.example.pc_1040.multiplespantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent il = new Intent (getApplicationContext(),MainActivity.class);
                startActivity(il);
            }
        });

    }
}

