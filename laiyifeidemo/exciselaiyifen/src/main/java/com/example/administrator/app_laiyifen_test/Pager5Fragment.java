package com.example.administrator.app_laiyifen_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/7/29.
 */
public class Pager5Fragment extends Fragment  implements View.OnClickListener{
    LinearLayout paper5purse;
    LinearLayout paper5order;
    View pager5_layout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState){
        View pager5_layout=inflater.inflate(R.layout.pager5_layout,container,false);

        initUI();
        return pager5_layout;
    }
    protected void initUI(){
        paper5purse = (LinearLayout) pager5_layout.findViewById(R.id.paper5_purse);
        paper5purse.setOnClickListener(this);
        paper5order=(LinearLayout)pager5_layout.findViewById(R.id.paper5_order);
    }
    @Override
    public  void onClick(View v){
        switch (v.getId()){
            case R.id.paper5_purse:
                Intent intent=new Intent(getContext(),purse_activity.class);
                startActivity(intent);
                break;
            case R.id.paper5_order:
                Intent intent1=new Intent(getContext(),OrderActivity.class);
                startActivity(intent1);
                break;

            default:
                break;
        }
    }
}

