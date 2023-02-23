package com.dfavo.ielts.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.fragments.FragCommunity;

public class AdaptorCommunity extends RecyclerView.Adapter<AdaptorCommunity.MyViewHolder> {
    public AdaptorCommunity(FragCommunity fragCommunity) {
    }

    @NonNull
    @Override
    public AdaptorCommunity.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_community, parent, false);
        return new AdaptorCommunity.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorCommunity.MyViewHolder holder, int position) {

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
