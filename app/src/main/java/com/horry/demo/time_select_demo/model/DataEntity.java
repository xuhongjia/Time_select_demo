package com.horry.demo.time_select_demo.model;

import java.util.List;

/**
 * Created by Administrator on 2015/12/3.
 */
public class DataEntity {
    private String name;
    private String date;
    /**
     * hour : 18:00
     * timestamp : 1449050400
     * available : 1
     */

    private List<ScheduleEntity> schedule;

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSchedule(List<ScheduleEntity> schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public List<ScheduleEntity> getSchedule() {
        return schedule;
    }
}
