package com.dfavo.ielts.delete_me.listening;

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

public class Lt1 extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Lt1Adaptor lt1Adaptor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.essay_listen_fragment, container, false);
        recyclerView=view.findViewById(R.id.recylerview_essay_listen);
        EssayListenRecyler();
        return view;
    }

    private void EssayListenRecyler() {

        lt1Adaptor=new Lt1Adaptor(this);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(lt1Adaptor);
    }
}
