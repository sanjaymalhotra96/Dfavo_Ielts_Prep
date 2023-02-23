package com.dfavo.ielts.complete_profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class CpPage4RvAdaptor extends RecyclerView.Adapter<CpPage4RvAdaptor.MyViewHolder>{
    public CpPage4RvAdaptor(CpPage4 completeProfile4) {
    }

    @NonNull
    @Override
    public CpPage4RvAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.complete_profile_recyclerview, parent, false);
        return new CpPage4RvAdaptor.MyViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull CpPage4RvAdaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
