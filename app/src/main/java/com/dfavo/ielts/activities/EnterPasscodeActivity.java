package com.dfavo.ielts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dfavo.ielts.MainActivity;
import com.dfavo.ielts.R;

public class EnterPasscodeActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode);
        button=findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterPasscodeActivity.this, MainActivity.class);
                startActivity(intent);
            }




        });
    }
}