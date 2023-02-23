package com.dfavo.ielts.adaptors;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.fragments.FragExplore;

public class AdaptorUpcoming extends RecyclerView.Adapter<AdaptorUpcoming.MyViewHolder> {
    public AdaptorUpcoming(FragExplore fragExplore) {
    }

    @NonNull
    @Override
    public AdaptorUpcoming.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_upcoming, parent, false);
        return new AdaptorUpcoming.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorUpcoming.MyViewHolder holder, int position) {

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

