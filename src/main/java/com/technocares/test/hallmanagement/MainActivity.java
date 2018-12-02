package com.technocares.test.hallmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends android.support.v7.app.AppCompatActivity{

    Button mButtonStart;
    Button mButtonEnd;
    Button mButtonManageWaiter;
    Button mButtonManageTables;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//sadasd
        mButtonStart = findViewById(R.id.start_time);
        mButtonEnd = findViewById(R.id.end_time);
        mButtonManageWaiter = findViewById(R.id.manage_waiter);
        mButtonManageTables = findViewById(R.id.manage_tables);

        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date d = new Date();
                mButtonStart.setText(d.getHours() + ":" + d.getMinutes());
            }
        });

        mButtonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date d = new Date();
                mButtonEnd.setText(d.getHours() + ":" + d.getMinutes());
            }
        });

        mButtonManageWaiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Manage_Waiters.class);
                startActivity(intent);
            }
        });

        mButtonManageTables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Manage_Tables.class);
                startActivity(intent);
            }
        });
    }
}
