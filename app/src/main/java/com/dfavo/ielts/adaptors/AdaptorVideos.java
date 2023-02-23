package com.dfavo.ielts.adaptors;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.activities.VideoCoursesActivity;
import com.dfavo.ielts.fragments.FragVideos;

public class AdaptorVideos extends RecyclerView.Adapter<AdaptorVideos.MyViewHolder> {
   Context context;

    public AdaptorVideos(FragVideos fragVideos) {

        context=fragVideos.getContext();
    }

    @NonNull
    @Override
    public AdaptorVideos.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_videos, parent, false);
        return new AdaptorVideos.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorVideos.MyViewHolder holder, int position) {
holder.vedio_click.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(context, VideoCoursesActivity.class);
        context.startActivity(i);
    }
});
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        CardView vedio_click;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            vedio_click=itemView.findViewById(R.id.vedio_click);
        }
    }
}
