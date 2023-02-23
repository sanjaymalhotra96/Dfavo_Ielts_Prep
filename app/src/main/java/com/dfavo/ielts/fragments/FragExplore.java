package com.dfavo.ielts.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

import com.dfavo.ielts.activities.EnterPasscodeActivity;
import com.dfavo.ielts.adaptors.AdaptorLatestBlogs;
import com.dfavo.ielts.adaptors.AdaptorUpcoming;
import com.dfavo.ielts.rwl.RWLActivity;
import com.dfavo.ielts.speaking.SpeakingActivity;

public class FragExplore extends Fragment {

    LinearLayoutManager linearLayoutManager, linearLayoutManager2;
    RecyclerView recyclerView, recyclerView1;
    AdaptorUpcoming adapterupcoming;
    AdaptorLatestBlogs adaptorLatestBlogs;
    RelativeLayout writing_click,speaking_click,reading_click,listening_click;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);
        recyclerView = view.findViewById(R.id.recylerview_upcoming);
        recyclerView1 = view.findViewById(R.id.recylerview_latest_blogs);
        writing_click = view.findViewById(R.id.writing);
        speaking_click=view.findViewById(R.id.speaking);
        reading_click = view.findViewById(R.id.reading);
        listening_click=view.findViewById(R.id.listening);
        UpComingRecyler();
        LatestBlogsRecycler();
        WritingClick();
        SpeakingClick();
        ReadingClick();
        ListeningClick();
        return view;
    }

    private void ListeningClick() {

        listening_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RWLActivity.class);
                startActivity(intent);
            }
        });
    }

    private void ReadingClick() {


        reading_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RWLActivity.class);
                startActivity(intent);
            }
        });
    }

    private void SpeakingClick() {

        speaking_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SpeakingActivity.class);
                startActivity(intent);
            }
        });
    }

    private void WritingClick() {
        writing_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RWLActivity.class);
                startActivity(intent);
            }
        });
    }

    private void LatestBlogsRecycler() {

        adaptorLatestBlogs = new AdaptorLatestBlogs(this);
        linearLayoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(linearLayoutManager2);
        recyclerView1.setAdapter(adaptorLatestBlogs);
    }

    private void UpComingRecyler() {
        adapterupcoming = new AdaptorUpcoming(this);
        linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterupcoming);

    }

}
