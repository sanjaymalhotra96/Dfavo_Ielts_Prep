package com.dfavo.ielts.rwl.essay;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class EssayActivityRvAdaptor extends RecyclerView.Adapter<EssayActivityRvAdaptor.MyViewHolder> {

    Context context;



    public EssayActivityRvAdaptor(EssayActivity essayActivity) {
        context=essayActivity;
    }

    @NonNull
    @Override
    public EssayActivityRvAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_essay2, parent, false);
        return new EssayActivityRvAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EssayActivityRvAdaptor.MyViewHolder holder, int position) {

        holder.essay_sub_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(context,UserInputEssayActivity.class);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        LinearLayout essay_sub_click;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            essay_sub_click=itemView.findViewById(R.id.essay_sub_click);

        }
    }
}
