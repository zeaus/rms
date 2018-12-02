package com.technocares.test.hallmanagement;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter2 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] table1_ID;
    private final String[] table2_ID;

    public CustomAdapter2(Activity context, String[] id1, String[] id2) {
        super(context, R.layout.list_layout2, id1);
        this.context = context;
        this.table1_ID = id1;
        this.table2_ID = id2;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_layout2, null, true);
        TextView table1_id = (TextView) rowView.findViewById(R.id.tid1);
        TextView table2_id = (TextView) rowView.findViewById(R.id.tid2);


        table1_id.setText(table1_ID[position]);
        table2_id.setText(table2_ID[position]);

        return rowView;
    }

}
