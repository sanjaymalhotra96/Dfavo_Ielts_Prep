package com.dfavo.ielts.delete_me.listening;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class Lt1Adaptor extends RecyclerView.Adapter<Lt1Adaptor.MyViewHolder> {
    public Lt1Adaptor(Lt1 lt1) {
    }

    @NonNull
    @Override
    public Lt1Adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_essay_listen, parent, false);
        return new Lt1Adaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Lt1Adaptor.MyViewHolder holder, int position) {

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
