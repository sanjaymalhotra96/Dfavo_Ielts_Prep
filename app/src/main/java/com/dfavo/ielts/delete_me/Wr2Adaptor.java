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
import com.dfavo.ielts.rwl.graphs.GraphsActivity;

public class Wr2Adaptor extends RecyclerView.Adapter<Wr2Adaptor.MyViewHolder> {
    Context context;
    public Wr2Adaptor(Wr2 wr2) {
        context= wr2.getContext();
    }

    @NonNull
    @Override
    public Wr2Adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_graphs, parent, false);
        return new Wr2Adaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Wr2Adaptor.MyViewHolder holder, int position) {

        holder.graph_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, GraphsActivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        LinearLayout graph_click;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            graph_click=itemView.findViewById(R.id.graph_click);


        }
    }
}
