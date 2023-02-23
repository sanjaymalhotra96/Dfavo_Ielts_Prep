package com.dfavo.ielts.rwl.graphs;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class GraphsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    GraphsActivityRvAdaptor graphsActivityRvAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);
        recyclerView=findViewById(R.id.recylerview_graphs2);
        GraphsRecyler();
    }

    private void GraphsRecyler() {

        graphsActivityRvAdaptor =new GraphsActivityRvAdaptor(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(graphsActivityRvAdaptor);
    }
}