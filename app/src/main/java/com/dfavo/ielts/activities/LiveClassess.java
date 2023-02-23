package com.dfavo.ielts.activities;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.adaptors.AdaptorLiveClassess;

public class LiveClassess extends AppCompatActivity {
    RecyclerView recyclerView;
    AdaptorLiveClassess adaptorLiveClassess;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_classess);
        recyclerView=findViewById(R.id.recylerview_live_classess);
        LiveClassesRecyler();
    }

    private void LiveClassesRecyler() {

        adaptorLiveClassess=new AdaptorLiveClassess(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptorLiveClassess);
    }
}