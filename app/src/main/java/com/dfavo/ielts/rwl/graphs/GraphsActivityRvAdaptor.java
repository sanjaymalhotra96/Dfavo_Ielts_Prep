package com.dfavo.ielts.rwl.graphs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class GraphsActivityRvAdaptor extends RecyclerView.Adapter<GraphsActivityRvAdaptor.MyViewHolder> {

    Context context;


    public GraphsActivityRvAdaptor(GraphsActivity graphsActivity) {
        context=graphsActivity;
    }

    @NonNull
    @Override
    public GraphsActivityRvAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_graphs2, parent, false);
        return new GraphsActivityRvAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GraphsActivityRvAdaptor.MyViewHolder holder, int position) {


        holder.graph_sub_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,UserInputGraphsActivity.class);
                context.startActivity(i);
            }
        });



    }

    @Override
    public int getItemCount() {
        return 10;
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder {
LinearLayout graph_sub_click;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            graph_sub_click=itemView.findViewById(R.id.graph_sub_click);

        }
    }
}
