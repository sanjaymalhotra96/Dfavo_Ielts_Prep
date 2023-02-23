package com.dfavo.ielts.activities;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.adaptors.AdaptorVideoCourses;

public class VideoCoursesActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdaptorVideoCourses adaptorVideoCourses;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_courses);
        recyclerView=findViewById(R.id.recylerview_video_courses);
        VedioCoursesRecyler();
    }

    private void VedioCoursesRecyler() {

        adaptorVideoCourses =new AdaptorVideoCourses(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptorVideoCourses);
    }
}