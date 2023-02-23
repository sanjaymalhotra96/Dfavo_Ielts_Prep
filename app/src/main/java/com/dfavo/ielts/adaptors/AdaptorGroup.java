package com.dfavo.ielts.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.activities.GroupActivity;

public class AdaptorGroup extends RecyclerView.Adapter<AdaptorGroup.MyViewHolder> {
    public AdaptorGroup(GroupActivity groupActivity) {
    }

    @NonNull
    @Override
    public AdaptorGroup.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylcerview_group, parent, false);
        return new AdaptorGroup.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorGroup.MyViewHolder holder, int position) {

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
