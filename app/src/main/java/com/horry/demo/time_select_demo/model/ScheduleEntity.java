package com.horry.demo.time_select_demo.model;

/**
 * Created by Administrator on 2015/12/3.
 */
public class ScheduleEntity {
    private String hour;
    private int timestamp;
    private int available;

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getHour() {
        return hour;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public int getAvailable() {
        return available;
    }
}
