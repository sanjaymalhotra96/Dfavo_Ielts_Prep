package com.dfavo.ielts.delete_me.reading;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class Rd1Adaptor extends RecyclerView.Adapter<Rd1Adaptor.MyViewHolder> {
    public Rd1Adaptor(Rd1 rd1) {
    }

    @NonNull
    @Override
    public Rd1Adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_essay_read, parent, false);
        return new Rd1Adaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Rd1Adaptor.MyViewHolder holder, int position) {

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
