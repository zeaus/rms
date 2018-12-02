package com.technocares.test.hallmanagement;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Waiter_Adopter extends RecyclerView.Adapter<Waiter_Adopter.MyViewHolder> {
    private List<waiter> waiter_list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, start_time, end_time;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            start_time = (TextView) view.findViewById(R.id.start_time_);
            end_time = (TextView) view.findViewById(R.id.end_time_);
        }
    }
    public Waiter_Adopter(List<waiter> waiter_list) {
        this.waiter_list = waiter_list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup view, int viewType) {
        ViewGroup itemView = (ViewGroup) LayoutInflater.from(view.getContext()).inflate(R.layout.list_waiter,view,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        waiter temp = waiter_list.get(position);
        myViewHolder.name.setText(temp.getName());
        myViewHolder.start_time.setText(temp.getStart_time());
        myViewHolder.end_time.setText(temp.getEnd_time());
    }

    @Override
    public int getItemCount( ) {
        return waiter_list.size();
    }
}
