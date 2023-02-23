package com.dfavo.ielts.delete_me;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;
import com.dfavo.ielts.speaking.SpeakingSelectedPartActivity;


public class SpeakingAdaptor extends RecyclerView.Adapter<SpeakingAdaptor.MyViewHolder> {

    Context context;


    public SpeakingAdaptor(Speaking1 speaking1) {
        context=speaking1.getContext();
    }

    @NonNull
    @Override
    public SpeakingAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.speaking_recyclerview, parent, false);
        return new SpeakingAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpeakingAdaptor.MyViewHolder holder, int position) {
           holder.introduction_click.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(context, SpeakingSelectedPartActivity.class);
        context.startActivity(i);
    }
});
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        LinearLayout introduction_click;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            introduction_click=itemView.findViewById(R.id.introduction_click);

        }
    }
}
