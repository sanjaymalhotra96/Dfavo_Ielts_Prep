package com.dfavo.ielts.rwl.essay;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class EssayActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    EssayActivityRvAdaptor essayActivityRvAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay);
        recyclerView=findViewById(R.id.recylerview_essay2);
        EssayRecyler();

    }

    private void EssayRecyler() {

        essayActivityRvAdaptor =new EssayActivityRvAdaptor(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(essayActivityRvAdaptor);
    }
}