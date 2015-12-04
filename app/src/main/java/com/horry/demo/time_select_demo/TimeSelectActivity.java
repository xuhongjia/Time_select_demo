package com.horry.demo.time_select_demo;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.horry.demo.time_select_demo.API.API;
import com.horry.demo.time_select_demo.API.HttpApi;
import com.horry.demo.time_select_demo.model.DataEntity;
import com.horry.demo.time_select_demo.model.Response;
import com.horry.demo.time_select_demo.model.ScheduleEntity;
import com.horry.demo.time_select_demo.utils.FastBlur;
import com.horry.demo.time_select_demo.utils.HorizonAdapter;
import com.horry.demo.time_select_demo.utils.TimeAdapter;
import com.horry.demo.time_select_demo.wedgit.HorizontalListView;
import com.horry.demo.time_select_demo.wedgit.HorizontalScrollListView;

import org.kymjs.kjframe.http.HttpCallBack;

import java.util.ArrayList;
import java.util.List;

public class TimeSelectActivity extends AppCompatActivity {
    private List<DataEntity> dateModelList;
    //private LinearLayout date_horizontal;
    private HorizontalListView date_horizontal;
    //private HorizontalScrollListView date_horizontal;
    private View blur;
    private GridView time_GridView;
    private List<ScheduleEntity> timeList;
    private LayoutInflater mInflater;
    private Gson gson = new Gson();
    private HorizonAdapter horizonAdapter;
    private TimeAdapter timeAdapter;
    private int[] time_click;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg)
        {
            initView();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_select);
        mInflater = LayoutInflater.from(this);
        initData();
    }
    private void initData(){
        HttpApi.getData(API.DATA, new HttpCallBack() {
            @Override
            public void onSuccess(String t) {
                super.onSuccess(t);
                Response response = gson.fromJson(t, Response.class);
                if (response.getData() != null) {
                    dateModelList = response.getData();
                    timeList = dateModelList.get(0).getSchedule();
                    time_click = new int[timeList.size()];
                }
                handler.sendEmptyMessage(1);
            }

            @Override
            public void onFailure(int errorNo, String strMsg) {
                super.onFailure(errorNo, strMsg);
            }
        });
    }
    private void initView(){
//        date_horizontal = (LinearLayout) findViewById(R.id.date_horizontal);
//        for (int i = 0 ;i < dateModelList.size() ; i++){
//            final View view = mInflater.inflate(R.layout.date_horizonal_item,date_horizontal,false);
//            final TextView top = (TextView) view.findViewById(R.id.week);
//            final TextView bottom = (TextView) view.findViewById(R.id.date);
//            top.setText(dateModelList.get(i).getName());
//            bottom.setText(dateModelList.get(i).getDate());
//            view .setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    view.setSelected(true);
//                    top.setSelected(true);
//                    bottom.setSelected(true);
//                }
//            });
//            date_horizontal.addView(view);
//        }
        blur = findViewById(R.id.blur);
        date_horizontal = (HorizontalListView) findViewById(R.id.date_horizontal);
        horizonAdapter = new HorizonAdapter(this,dateModelList,R.layout.date_horizonal_item);
        date_horizontal.setAdapter(horizonAdapter);
        date_horizontal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                horizonAdapter.setSelectId(position);
                horizonAdapter.notifyDataSetChanged();
                timeList = dateModelList.get(position).getSchedule();
                time_click = new int[timeList.size()];
                timeAdapter.setMdatas(timeList);
                timeAdapter.setTime_click(time_click);
                timeAdapter.notifyDataSetChanged();
            }
        });
        time_GridView = (GridView) findViewById(R.id.time_gridview);
        timeAdapter = new TimeAdapter(this,dateModelList.get(horizonAdapter.getSelectId()).getSchedule(),R.layout.time_gridview_item,time_click);
        time_GridView.setAdapter(timeAdapter);
        time_GridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(time_click[position]==0){
                    Intent intent = new Intent();
                    intent.putExtra("date", dateModelList.get(horizonAdapter.getSelectId()).getDate().toString());
                    intent.putExtra("time", timeList.get(position).getHour());
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });
//        Bitmap bkg = ((BitmapDrawable)getResources().getDrawable(R.drawable.hui)).getBitmap();
//        blur(bkg,blur);
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void blur(Bitmap bkg, View view) {
        int radius = 10;

        Bitmap overlay = Bitmap.createBitmap((int) (view.getMeasuredWidth()),
                (int) (view.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(overlay);
        canvas.translate(-view.getLeft(), -view.getTop());
        canvas.drawBitmap(bkg, 0, 0, null);
        overlay = FastBlur.doBlur(overlay, radius, true);
        view.setBackground(new BitmapDrawable(getResources(), overlay));
    }

}
