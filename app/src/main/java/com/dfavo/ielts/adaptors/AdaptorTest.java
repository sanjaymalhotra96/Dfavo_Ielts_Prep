package com.dfavo.ielts.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.activities.TestActivity;

public class AdaptorTest extends RecyclerView.Adapter<AdaptorTest.MyViewHolder> {
    public AdaptorTest(TestActivity testActivity) {
    }

    @NonNull
    @Override
    public AdaptorTest.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylcerview_group, parent, false);
        return new AdaptorTest.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorTest.MyViewHolder holder, int position) {

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
