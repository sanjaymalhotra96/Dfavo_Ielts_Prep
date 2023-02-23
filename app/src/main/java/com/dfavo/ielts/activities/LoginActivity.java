package com.dfavo.ielts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.on_boarding.ObActivity;

public class LoginActivity extends AppCompatActivity {
Button button;
TextView privacy_policy_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button=findViewById(R.id.otp_button);
        privacy_policy_textview=findViewById(R.id.privacy_policy_textview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, OtpActivity.class);
                startActivity(intent);
            }
        });
        final SpannableStringBuilder sb = new SpannableStringBuilder("By  signing up you to agree to ours Terms of service \n & privacy policy");
        final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);

        sb.setSpan(bss, 35, 71, Spannable.SPAN_INCLUSIVE_INCLUSIVE);

        privacy_policy_textview.setText(sb);
    }
}