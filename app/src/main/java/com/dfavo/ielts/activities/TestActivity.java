package com.dfavo.ielts.activities;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.adaptors.AdaptorTest;

public class TestActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    AdaptorTest adaptorTest;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        recyclerView=findViewById(R.id.recylerview_test);
        button=findViewById(R.id.test_button);
        TestAdaptor();
        ButtonClick();
    }

    private void ButtonClick() {
        /*Intent i=new Intent(this,ListeningActivity.class);
        startActivity(i);*/


    }

    private void TestAdaptor() {
        adaptorTest=new AdaptorTest(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptorTest);
    }
}