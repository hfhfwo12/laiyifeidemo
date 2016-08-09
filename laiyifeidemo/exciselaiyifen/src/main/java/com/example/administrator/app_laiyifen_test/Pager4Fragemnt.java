package com.example.administrator.app_laiyifen_test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/7/22.
 */
public class Pager4Fragemnt extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View pager4layout=inflater.inflate(R.layout.pager4_layout,container,false);
        return pager4layout;
    }
}
