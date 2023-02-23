package com.dfavo.ielts.delete_me;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class Wr2 extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Wr2Adaptor wr2Adaptor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.graphs_fragment, container, false);
        recyclerView=view.findViewById(R.id.recylerview_graphs);

        GraphsRecyler();
        return view;
    }

    private void GraphsRecyler() {

        wr2Adaptor=new Wr2Adaptor(this);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(wr2Adaptor);
    }

}
