package com.dfavo.ielts.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.activities.LiveClassess;

public class AdaptorLiveClassess extends RecyclerView.Adapter<AdaptorLiveClassess.MyViewHolder> {
    public AdaptorLiveClassess(LiveClassess liveClassess) {
    }

    @NonNull
    @Override
    public AdaptorLiveClassess.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_live_classess, parent, false);
        return new AdaptorLiveClassess.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorLiveClassess.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
