package com.technocares.test.hallmanagement;

public class waiter {

    private String name,cnic, start_time, end_time,assigned_table;

    public waiter()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getAssigned_table() {
        return assigned_table;
    }

    public void setAssigned_table(String assigned_table) {
        this.assigned_table = assigned_table;
    }

    public waiter(String name, String start_time, String end_time)
    {
        this.name = name;
        this.start_time = start_time;
        this.end_time = end_time;
    }
}
