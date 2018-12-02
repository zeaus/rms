package com.technocares.test.hallmanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Manage_Waiters extends AppCompatActivity {
    List<waiter> waiter_List = new ArrayList<waiter>();
    private RecyclerView recyclerView;
    private Waiter_Adopter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage__waiters);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter =  new Waiter_Adopter(waiter_List);
        // use a linear layout manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // specify an adapter (see also next example)
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnItemTouchListener(new Recycler_click(getApplicationContext(), recyclerView, new Recycler_click.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                waiter w1 = waiter_List.get(position);
                Toast.makeText(getApplicationContext(), w1.getName() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareWaiterList();

    }

    private void prepareWaiterList() {
        waiter w1 = new waiter("a","1","2");
        waiter_List.add(w1);
        waiter w2 = new waiter("B","1","2");
        waiter_List.add(w2);
        waiter w3 = new waiter("c","1","2");
        waiter_List.add(w3);
        mAdapter.notifyDataSetChanged();
    }
}
