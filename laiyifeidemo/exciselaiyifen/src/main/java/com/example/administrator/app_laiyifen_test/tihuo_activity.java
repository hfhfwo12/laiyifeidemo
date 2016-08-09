package com.example.administrator.app_laiyifen_test;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/7/29.
 */
public class tihuo_activity extends android.support.v4.app.FragmentActivity implements View.OnClickListener {

     private FragmentManager fragmentManager;
    private TextView t1;
    private TextView t2;
    private TextView t3;
    private Fragment1 fragment1;
    private  Fragment2 fragment2;
    private Fragment3 fragment3;
     @Override
     protected void  onCreate(Bundle saveInstanceState) {
         super.onCreate(saveInstanceState);
         setContentView(R.layout.activity_tihuo);
         fragmentManager=getSupportFragmentManager();
         setTabSelection(0);
         initViews();
     }
        @Override
        public void onClick(View v){
             switch (v.getId()){
                 case R.id.useable:
                     setTabSelection(0);
                     break;
                 case R.id.use:
                     setTabSelection(1);
                     break;
                 case R.id.longtime:
                     setTabSelection(2);
                     break;
                 default:
                     break;
             }
        }
    private void initViews(){
        t1 =(TextView)findViewById(R.id.useable);
        t2 =(TextView)findViewById(R.id.use);
        t3 =(TextView)findViewById( R.id.longtime);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
    }
    private void setTabSelection(int index){
        clearSelection();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        hideFragments(transaction);
        switch (index){
            case 0:
                t1.setTextColor(Color.BLACK);
                t1.setBackgroundColor(Color.parseColor("#FF5000"));
                if(fragment1 ==null){
                    fragment1 =new Fragment1();
                    transaction.add(R.id.content, fragment1);
                }else{
                    transaction.show(fragment1);
                }
                break;
            case 1:
                t2.setTextColor(Color.BLACK);
                t2.setBackgroundColor(Color.parseColor("#FF5000"));
                if (fragment2 == null) {
                    fragment2 = new Fragment2();
                    transaction.add(R.id.content, fragment2);
                } else {
                    transaction.show(fragment2);
                }
                break;
            case 2:
                t3.setTextColor(Color.BLACK);
                t3.setBackgroundColor(Color.parseColor("#FF5000"));
                if (fragment3 == null) {
                    fragment3 = new Fragment3();
                    transaction.add(R.id.content, fragment3);
                } else {

                    transaction.show(fragment3);
                }
                break;
        }
        transaction.commit();

    }
    private void clearSelection(){

        t1.setTextColor(Color.parseColor("#000"));
        t1.setBackgroundColor(Color.parseColor("#fff"));
        t2.setTextColor(Color.parseColor("#000"));
        t2.setBackgroundColor(Color.parseColor("#fff"));
        t3.setTextColor(Color.parseColor("#000"));
        t3.setBackgroundColor(Color.parseColor("#fff"));
    }
    private void hideFragments(FragmentTransaction transaction){
        if(fragment1 !=null){
            transaction.hide(fragment1);
        }
        if (fragment2 !=null){
            transaction.hide(fragment2);
        }
        if (fragment3 !=null){
            transaction.hide(fragment3);
        }

    }
}
