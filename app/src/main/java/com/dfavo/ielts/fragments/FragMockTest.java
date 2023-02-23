package com.dfavo.ielts.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dfavo.ielts.R;
import com.dfavo.ielts.activities.ListeningActivity;

public class FragMockTest  extends Fragment {

    RelativeLayout listening_sub_click;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mock_test, container, false);
        listening_sub_click=view.findViewById(R.id.listening_sub_click);
        listening_sub_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getContext(), ListeningActivity.class);
                startActivity(i);


            }
        });
        return view;
    }
}
