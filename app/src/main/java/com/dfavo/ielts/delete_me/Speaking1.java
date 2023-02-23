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

public class Speaking1 extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
  SpeakingAdaptor speakingAdaptor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.speaking1_fragment, container, false);
        recyclerView=view.findViewById(R.id.speaking_recyclerview);
        speakingAdaptor=new SpeakingAdaptor(this);
        linearLayoutManager=new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(speakingAdaptor);
        return view;
    }
}
