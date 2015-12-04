package com.horry.demo.time_select_demo.utils;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.horry.demo.time_select_demo.R;
import com.horry.demo.time_select_demo.model.DataEntity;
import java.util.List;

/**
 * Created by Administrator on 2015/12/3.
 */
public class HorizonAdapter extends CommonBaseAdapter<DataEntity> {
    private int selectId = 0;
    public HorizonAdapter(Context context, List<DataEntity> datas, int layoutId) {
        super(context, datas, layoutId);
    }

    @Override
    public void convert(ViewHolder holder, DataEntity dataEntity) {
        View view = holder.getConvertView();
        TextView top = holder.getView(R.id.week);
        TextView bottom = holder.getView(R.id.date);
        top.setText(dataEntity.getName());
        bottom.setText(dataEntity.getDate());
        if(holder.getmPosition()==getSelectId())
        {
            view.setSelected(true);
            top.setSelected(true);
            bottom.setSelected(true);
        }
        else
        {
            view.setSelected(false);
            top.setSelected(false);
            bottom.setSelected(false);
        }
    }

    public int getSelectId() {
        return selectId;
    }

    public void setSelectId(int selectId) {
        this.selectId = selectId;
    }
}
