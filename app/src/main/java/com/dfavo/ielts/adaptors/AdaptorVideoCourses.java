package com.dfavo.ielts.adaptors;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.activities.VedioViewActivity;
import com.dfavo.ielts.activities.VideoCoursesActivity;

public class AdaptorVideoCourses extends RecyclerView.Adapter<AdaptorVideoCourses.MyViewHolder> {

    Context context;


    public AdaptorVideoCourses(VideoCoursesActivity videoCoursesActivity) {
        context=videoCoursesActivity;
    }

    @NonNull
    @Override
    public AdaptorVideoCourses.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_video_courses, parent, false);
        return new AdaptorVideoCourses.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorVideoCourses.MyViewHolder holder, int position) {
        holder.video_sub_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, VedioViewActivity.class);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        CardView video_sub_click;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            video_sub_click=itemView.findViewById(R.id.video_sub_click);
        }
    }
}
