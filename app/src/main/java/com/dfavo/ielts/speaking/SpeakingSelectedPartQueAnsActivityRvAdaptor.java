package com.dfavo.ielts.speaking;

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

public class SpeakingSelectedPartQueAnsActivityRvAdaptor extends RecyclerView.Adapter<SpeakingSelectedPartQueAnsActivityRvAdaptor.MyViewHolder> {

   Context context;

    public SpeakingSelectedPartQueAnsActivityRvAdaptor(SpeakingSelectedPartQueAnsActivity speakingSelectedPartQueAnsActivity) {
        context=speakingSelectedPartQueAnsActivity;

    }

    @NonNull
    @Override
    public SpeakingSelectedPartQueAnsActivityRvAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cuecard_recyclerview, parent, false);
        return new SpeakingSelectedPartQueAnsActivityRvAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpeakingSelectedPartQueAnsActivityRvAdaptor.MyViewHolder holder, int position) {
        holder.cue_card_voice_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, VoiceRecordingActivity.class);
                context.startActivity(i);
            }
        });




    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

LinearLayout cue_card_voice_click;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cue_card_voice_click=itemView.findViewById(R.id.cue_card_voice_click);
        }
    }
}
