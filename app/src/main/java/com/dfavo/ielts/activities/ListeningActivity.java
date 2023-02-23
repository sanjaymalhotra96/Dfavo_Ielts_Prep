package com.dfavo.ielts.activities;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.adaptors.AdaptorMockTest;


public class ListeningActivity extends AppCompatActivity {
RecyclerView recyclerView;
AdaptorMockTest adaptorMockTest;
LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening2);
        recyclerView=findViewById(R.id.recylcerview_listening_mocktest);
        MockTestRecyler();
    }

    private void MockTestRecyler() {
        adaptorMockTest=new AdaptorMockTest(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptorMockTest);
    }
}