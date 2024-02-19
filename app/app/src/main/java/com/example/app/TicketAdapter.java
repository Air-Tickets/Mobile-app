package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TicketAdapter extends RecyclerView.Adapter<TicketViewHolder> {


    Context context;
    List<Ticket> tickets;

    public TicketAdapter(Context context, List<Ticket> tickets) {
        this.context = context;
        this.tickets = tickets;
    }

    @NonNull
    @Override
    public TicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TicketViewHolder(LayoutInflater.from(context).inflate(R.layout.ticket_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TicketViewHolder holder, int position) {
        holder.start.setText(tickets.get(position).getStart());
        holder.stop.setText(tickets.get(position).getStop());
        holder.date.setText(tickets.get(position).getDate());
        holder.boatman.setText(tickets.get(position).getBoatman());


    }

    @Override
    public int getItemCount() {
        return tickets.size();
    }
}
