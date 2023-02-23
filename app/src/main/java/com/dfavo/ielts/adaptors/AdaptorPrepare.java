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
import com.dfavo.ielts.fragments.FragPrepare;
import com.dfavo.ielts.vocabulary.VocabularyActivity;

public class AdaptorPrepare extends RecyclerView.Adapter<AdaptorPrepare.MyViewHolder> {
   Context context;

    public AdaptorPrepare(FragPrepare fragPrepare) {
        context=fragPrepare.getContext();
    }

    @NonNull
    @Override
    public AdaptorPrepare.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_prepare, parent, false);
        return new AdaptorPrepare.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorPrepare.MyViewHolder holder, int position) {

        holder.vocabulary_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, VocabularyActivity.class);
                context.startActivity(i);
            }
        });



    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        CardView vocabulary_click;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            vocabulary_click=itemView.findViewById(R.id.vocabulary_click);
        }
    }
}
