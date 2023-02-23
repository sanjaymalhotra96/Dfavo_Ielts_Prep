package com.dfavo.ielts.complete_profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dfavo.ielts.R;
import com.dfavo.ielts.activities.EnterPasscodeActivity;

public class CpPage6 extends Fragment {
Button button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.complete_profile6, container, false);
        button=view.findViewById(R.id.submit_proceed_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EnterPasscodeActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}