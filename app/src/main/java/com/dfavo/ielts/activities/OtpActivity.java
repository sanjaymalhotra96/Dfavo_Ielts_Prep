package com.dfavo.ielts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dfavo.ielts.R;
import com.dfavo.ielts.complete_profile.CpActivity;

public class OtpActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        button=findViewById(R.id.proceed_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtpActivity.this, CpActivity.class);
                startActivity(intent);
            }
        });
    }
}