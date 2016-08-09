package com.example.administrator.app_laiyifen_test;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/29.
 */
public class youhuiquan_activity  extends  FragmentActivity {
    ViewPager vp;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youhuiquan);
        InitTextView();
        InitViewPager();
        setTabSelection(0);

    }
    private void setTabSelection(int index) {
        clearSelection();
        switch (index) {
            case 0:
                t1.setTextColor(Color.BLACK);
                t1.setBackgroundColor(Color.parseColor("#FF5000"));
                break;
            case 1:
                t2.setTextColor(Color.BLACK);
                t2.setBackgroundColor(Color.parseColor("#FF5000"));
                break;
            case 2:
                t3.setTextColor(Color.BLACK);
                t3.setBackgroundColor(Color.parseColor("#FF5000"));
                break;
            case 3:
                t4.setTextColor(Color.BLACK);
                t4.setBackgroundColor(Color.parseColor("#FF5000"));
                break;
        }
    }
    private void InitViewPager(){
        List<Fragment> fragments=new ArrayList<Fragment>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        fragments.add(new Fragment4());
        FragAdapter adapter = new FragAdapter(getSupportFragmentManager(), fragments);
        vp = (ViewPager)findViewById(R.id.viewpager);
        vp.setAdapter(adapter);
        vp.setCurrentItem(0);
    }
    private void  InitTextView(){
        t1=(TextView) findViewById(R.id.usable);
        t2=(TextView)findViewById(R.id.used);
        t3=(TextView)findViewById(R.id.send);
        t4=(TextView)findViewById(R.id.overdue);
        t1.setOnClickListener(new MyOnClickListener(0));
        t2.setOnClickListener(new MyOnClickListener(1));
        t3.setOnClickListener(new MyOnClickListener(2));
        t4.setOnClickListener(new MyOnClickListener(3));
    }
    public class MyOnClickListener implements View.OnClickListener {
        private int index = 0;

        public MyOnClickListener(int i) {
            index = i;
        }

        @Override
        public void onClick(View v) {
            vp.setCurrentItem(index);
            switch (v.getId()) {
                case R.id.usable:
                    setTabSelection(0);
                    break;
                case R.id.used:
                    setTabSelection(1);
                    break;
                case R.id.send:
                    setTabSelection(2);
                    break;
                case R.id.overdue:
                    setTabSelection(3);
                    break;
            }
        }
    }
    private void clearSelection(){

        t1.setTextColor(Color.parseColor("#000"));
        t2.setTextColor(Color.parseColor("#000"));
        t3.setTextColor(Color.parseColor("#000"));
        t4.setTextColor(Color.parseColor("#000"));

    }
}