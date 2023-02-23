package com.dfavo.ielts.delete_me;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.rwl.essay.EssayActivity;

public class Wr1Adaptor extends RecyclerView.Adapter<Wr1Adaptor.MyViewHolder> {
    Context context;
    public Wr1Adaptor(Wr1 wr1) {
        context=wr1.getContext();
    }

    @NonNull
    @Override
    public Wr1Adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_essay, parent, false);
        return new Wr1Adaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Wr1Adaptor.MyViewHolder holder, int position) {
        holder.essay_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, EssayActivity.class);
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        LinearLayout essay_click;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            essay_click=itemView.findViewById(R.id.essay_click);


        }
    }
}
