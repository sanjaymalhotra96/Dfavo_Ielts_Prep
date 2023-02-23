package com.dfavo.ielts.speaking;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class SpeakingSelectedPartQueAnsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    SpeakingSelectedPartQueAnsActivityRvAdaptor speakingSelectedPartQueAnsActivityRvAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cue_cards1);
        recyclerView=findViewById(R.id.cuecard_recyclerview);
        CueCardRecyler();
    }

    private void CueCardRecyler() {

        speakingSelectedPartQueAnsActivityRvAdaptor =new SpeakingSelectedPartQueAnsActivityRvAdaptor(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(speakingSelectedPartQueAnsActivityRvAdaptor);
    }
}