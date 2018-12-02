package com.technocares.test.hallmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Manage_Tables extends AppCompatActivity {

    private String[] tableId={"TableID: 1","TableID: 2","TableID: 3","TableID: 4","TableID: 5"};
    private String[] tablecapacity={"Capacity: 2","Capacity: 4","Capacity: 4","Capacity: 2","Capacity: 6"};
    private ListView lst;
    private EditText t1;
    private EditText t2;
    public DataHolder dc=new DataHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage__tables);

        t1=findViewById(R.id.table1);
        t2=findViewById(R.id.table2);

        CustomAdapter1 adapter1;
        adapter1 = new CustomAdapter1(this,tableId,tablecapacity);
        lst=(ListView)findViewById(R.id.list1);
        lst.setAdapter(adapter1);

    }

    public void Mergetables(View view) {

        dc.Table1_id.add("Table1_Id: "+t1.getText().toString());
        dc.Table2_id.add("Table2_Id: "+t2.getText().toString());
        t1.setText("");
        t2.setText("");
        Toast.makeText(this, "Tables Merged", Toast.LENGTH_SHORT).show();

    }

    public void ShowMerged(View view) {
        startActivity(new Intent(getApplicationContext(),Merged_Tables.class));
    }

}
