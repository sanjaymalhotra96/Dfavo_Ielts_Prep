package com.dfavo.ielts.speaking;


import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dfavo.ielts.R;

public class VoiceRecordingActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cure_card_recording);
        textView=findViewById(R.id.textview_cue);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}