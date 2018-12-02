package com.technocares.test.hallmanagement;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter1 extends ArrayAdapter<String> {

private final Activity context;
private final String[] tableID;
private final String[] Capacity;

public CustomAdapter1(Activity context, String[] id, String[] cap) {
    super(context, R.layout.list_layout, id);
    this.context = context;
    this.tableID = id;
    this.Capacity = cap;
}

@Override
public View getView(int position, View view, ViewGroup parent)
{
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_layout, null, true);
        TextView tableid = (TextView) rowView.findViewById(R.id.txt1);
        TextView tablecap = (TextView) rowView.findViewById(R.id.txt2);


        tableid.setText(tableID[position]);
        tablecap.setText(Capacity[position]);
        return rowView;
}
}