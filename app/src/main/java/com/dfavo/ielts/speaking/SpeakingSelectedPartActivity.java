package com.dfavo.ielts.speaking;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class SpeakingSelectedPartActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    SpeakingSelectedPartActivityRvAdaptor speakingSelectedPartActivityRvAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        recyclerView=findViewById(R.id.introduction_recyclerview);
        IntroductionRecyler();
    }

    private void IntroductionRecyler() {

        speakingSelectedPartActivityRvAdaptor =new SpeakingSelectedPartActivityRvAdaptor(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(speakingSelectedPartActivityRvAdaptor);
    }
}