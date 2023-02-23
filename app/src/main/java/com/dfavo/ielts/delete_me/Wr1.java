package com.dfavo.ielts.delete_me;

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

public class Wr1 extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Wr1Adaptor wr1Adaptor;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.essay_fragment, container, false);
        recyclerView=view.findViewById(R.id.recylerview_essay);
       EssayRecyler();
        return view;
    }

    private void EssayRecyler() {

        wr1Adaptor=new Wr1Adaptor(this);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(wr1Adaptor);
    }
}
