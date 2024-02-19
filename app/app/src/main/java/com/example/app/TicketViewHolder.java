package com.example.app;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TicketViewHolder extends RecyclerView.ViewHolder {

    Button download;
    TextView start, stop, date, boatman;
    public TicketViewHolder(@NonNull View itemView) {
        super(itemView);
        download = itemView.findViewById(R.id.downloadButton);
        start = itemView.findViewById(R.id.start);
        stop = itemView.findViewById(R.id.stop);
        date = itemView.findViewById(R.id.date);
        boatman = itemView.findViewById(R.id.boatman);
    }
}
