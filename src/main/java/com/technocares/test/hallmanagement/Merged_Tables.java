package com.technocares.test.hallmanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class Merged_Tables extends AppCompatActivity {
    ListView lst;
    LinearLayout lst1;
    String[] table1_id;
    String[] table2_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merged__tables);

        setTitle("List Merged Tables");
        lst = (ListView) findViewById(R.id.list2);

        table1_id = new String[DataHolder.Table1_id.size()];
        table1_id = DataHolder.Table1_id.toArray(table1_id);
        table2_id = new String[DataHolder.Table2_id.size()];
        table2_id = DataHolder.Table2_id.toArray(table2_id);

        if (table1_id != null && table2_id != null) {
            CustomAdapter2 adapter1;
            adapter1 = new CustomAdapter2(this, table1_id, table2_id);
            lst.setAdapter(adapter1);
        } else {
            Toast.makeText(this, "Tables Null values", Toast.LENGTH_SHORT).show();
        }

    }
}