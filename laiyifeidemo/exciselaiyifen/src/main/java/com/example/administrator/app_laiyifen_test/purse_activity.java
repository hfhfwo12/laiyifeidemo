package com.example.administrator.app_laiyifen_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/7/27.
 */
public class purse_activity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout yidian;
    private LinearLayout youhui;
    private LinearLayout tihuo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qianbao);
        intUI();


    }
    protected void intUI(){
        yidian=(LinearLayout)findViewById(R.id.yidianka);
        youhui=(LinearLayout)findViewById(R.id.youhuiquan);
        tihuo=(LinearLayout)findViewById(R.id.tihuoquan);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.yidianka:
                Intent intent=new Intent(purse_activity.this,yidianka_activity.class);
                startActivity(intent);
                break;
            case R.id.youhuiquan:
                Intent intent1=new Intent(purse_activity.this,youhuiquan_activity.class);
                startActivity(intent1);
                break;
            case R.id.tihuoquan:
                Intent intent2=new Intent(purse_activity.this,tihuo_activity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }

    }
}