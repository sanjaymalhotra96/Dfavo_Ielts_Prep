package com.dfavo.ielts.adaptors;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.activities.Instructions;
import com.dfavo.ielts.activities.ListeningActivity;
import com.dfavo.ielts.activities.TestActivity;


public class AdaptorMockTest extends RecyclerView.Adapter<AdaptorMockTest.MyViewHolder> {
Context context;
    public AdaptorMockTest(ListeningActivity listeningActivity) {
        context=listeningActivity;
    }

    @NonNull
    @Override
    public AdaptorMockTest.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylcerview_listening_mocktest, parent, false);
        return new AdaptorMockTest.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorMockTest.MyViewHolder holder, int position) {
        holder.startTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, Instructions.class);
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
TextView startTest;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            startTest=itemView.findViewById(R.id.startTest);
        }
    }
}