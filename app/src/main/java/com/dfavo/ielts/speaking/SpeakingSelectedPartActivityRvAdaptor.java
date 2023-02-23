package com.dfavo.ielts.speaking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dfavo.ielts.R;

public class SpeakingSelectedPartActivityRvAdaptor extends RecyclerView.Adapter<SpeakingSelectedPartActivityRvAdaptor.MyViewHolder> {

    Context context;


    public SpeakingSelectedPartActivityRvAdaptor(SpeakingSelectedPartActivity speakingSelectedPartActivity) {
        context=speakingSelectedPartActivity;

    }



    @NonNull
    @Override
    public SpeakingSelectedPartActivityRvAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.introduction_recyclerview, parent, false);
        return new SpeakingSelectedPartActivityRvAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpeakingSelectedPartActivityRvAdaptor.MyViewHolder holder, int position) {

        holder.cue_card_cick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, SpeakingSelectedPartQueAnsActivity.class);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout cue_card_cick;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cue_card_cick=itemView.findViewById(R.id.cue_card_cick);

        }
    }
}
