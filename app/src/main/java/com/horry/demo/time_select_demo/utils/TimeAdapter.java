package com.horry.demo.time_select_demo.utils;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;

import com.horry.demo.time_select_demo.R;
import com.horry.demo.time_select_demo.model.ScheduleEntity;

import java.util.List;

/**
 * Created by Administrator on 2015/12/3.
 */
public class TimeAdapter extends CommonBaseAdapter<ScheduleEntity> {

    private int[] time_click;
    public TimeAdapter(Context context, List<ScheduleEntity> datas, int layoutId,int[] time_click) {
        super(context, datas, layoutId);
        this.time_click=time_click;
    }
    public TimeAdapter(Context context, List<ScheduleEntity> datas, int layoutId) {
        super(context, datas, layoutId);
    }
    @Override
    public void convert(ViewHolder holder, ScheduleEntity scheduleEntity) {
        TextView time = holder.getView(R.id.time);
        time.setText(scheduleEntity.getHour());
        if(scheduleEntity.getAvailable()==1)
        {
            if(holder.getmPosition()==0){
                time_click[holder.getmPosition()]=1;
                time.setTextColor(Color.GRAY);
                time.setEnabled(false);
            }
            else
            {
                time.setTextColor(Color.BLACK);
                time.setEnabled(true);
            }
        }
        else
        {
            time_click[holder.getmPosition()]=1;
            time.setEnabled(false);
        }
    }
    public int[] getTime_click() {
        return time_click;
    }

    public void setTime_click(int[] time_click) {
        this.time_click = time_click;
    }

}
