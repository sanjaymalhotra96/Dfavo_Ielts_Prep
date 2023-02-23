package com.dfavo.ielts.activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.dfavo.ielts.R;

public class Instructions extends AppCompatActivity {

    Button start_click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        start_click=findViewById(R.id.start_click);
        start_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),TestActivity.class);
                startActivity(i);
            }
        });
    }
}