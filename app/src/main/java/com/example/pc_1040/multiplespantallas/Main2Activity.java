package com.example.pc_1040.multiplespantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){

            @Override
                public void onClick(View view){
                    Intent il = new Intent (getApplicationContext(),Main3Activity.class);
                    startActivity(il);
            }
        });

    }
}
