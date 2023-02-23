package com.dfavo.ielts.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.adaptors.AdaptorPrepare;


public class FragPrepare extends Fragment {


    LinearLayoutManager linearLayoutManager;
    RecyclerView recyclerView;
    AdaptorPrepare adapterPrepare;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_prepare, container, false);
        recyclerView=view.findViewById(R.id.recylerview_prepare);
        PrepareRecyler();
        return view;
    }

    private void PrepareRecyler() {

        adapterPrepare=new AdaptorPrepare(this);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterPrepare);
    }
}
