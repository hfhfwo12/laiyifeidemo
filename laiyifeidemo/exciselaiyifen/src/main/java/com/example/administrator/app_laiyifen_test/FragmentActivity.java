package com.example.administrator.app_laiyifen_test;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Administrator on 2016/7/22.
 */
public class FragmentActivity extends android.support.v4.app.FragmentActivity implements View.OnClickListener {
    private Pager1Fragment pager1Fragment;
    private Pager2Fragment pager2Fragment;
    private Pager3Fragment pager3Fragment;
    private Pager4Fragemnt pager4Fragemnt;
    private Pager5Fragment pager5Fragemnt;
    private  View pager1layout;
    private  View pager2layout;
    private View pager3layout;
    private View pager4layout;
    private View paper5layout;
    private ImageView pager1Image;
    private ImageView pager2Image;
    private ImageView pager3Image;
    private ImageView pager4Image;
    private ImageView pager5Image;
    private TextView pager1Text;
    private TextView pager2Text;
    private TextView pager3Text;
    private TextView pager4Text;
    private TextView pager5Text;
    private FragmentManager fragmentManager;
    @Override
    protected void  onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
        fragmentManager=getSupportFragmentManager();
        setTabSelection(0);
        initViews();
    }
    private void initViews(){
        pager1layout =findViewById(R.id.pager1_layout);
        pager2layout =findViewById(R.id.pager2_layout);
        pager3layout =findViewById(R.id.pager3_layout);
        pager4layout =findViewById(R.id.pager4_layout);
        paper5layout =findViewById(R.id.paper5_layout);
        pager1Image =(ImageView) findViewById(R.id.pager1_image);
        pager2Image =(ImageView)findViewById(R.id.pager2_image);
        pager3Image =(ImageView)findViewById(R.id.pager3_image);
        pager4Image =(ImageView)findViewById(R.id.pager4_image);
        pager5Image=(ImageView)findViewById(R.id.paper5_image);
        pager1Text =(TextView)findViewById(R.id.pager1_text);
        pager2Text =(TextView)findViewById(R.id.pager2_text);
        pager3Text =(TextView)findViewById( R.id.pager3_text);
        pager4Text =(TextView)findViewById(R.id.pager4_text);
        pager5Text=(TextView)findViewById(R.id.paper5_text);
        pager1layout.setOnClickListener(this);
        pager2layout.setOnClickListener(this);
        pager3layout.setOnClickListener(this);
        pager4layout.setOnClickListener(this);
        paper5layout.setOnClickListener(this);
    }
    @Override
    public  void onClick(View v){
        switch (v.getId()){
            case R.id.pager1_layout:
                setTabSelection(0);
                break;
            case R.id.pager2_layout:
                setTabSelection(1);
                break;
            case R.id.pager3_layout:
                setTabSelection(2);
                break;
            case R.id.pager4_layout:
                setTabSelection(3);
                break;
            case R.id.paper5_layout:
                setTabSelection(4);
            default:
                break;
        }
    }
    private void setTabSelection(int index){
        clearSelection();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        hideFragments(transaction);
        switch (index){
            case 0:
                pager1Image.setImageResource(R.drawable.ic_launcher);
                pager1Text.setTextColor(Color.BLACK);
                if(pager1Fragment ==null){
                    pager1Fragment =new Pager1Fragment();
                    transaction.add(R.id.content, pager1Fragment);
                }else{
                    transaction.show(pager1Fragment);
                }
                break;
            case 1:

                pager2Image.setImageResource(R.drawable.ic_launcher);
                pager2Text.setTextColor(Color.BLACK);
                if (pager2Fragment == null) {

                    pager2Fragment = new Pager2Fragment();
                    transaction.add(R.id.content, pager2Fragment);
                } else {

                    transaction.show(pager2Fragment);
                }
                break;
            case 2:

                pager3Image.setImageResource(R.drawable.ic_launcher);
                pager3Text.setTextColor(Color.BLACK);
                if (pager3Fragment == null) {

                    pager3Fragment = new Pager3Fragment();
                    transaction.add(R.id.content, pager3Fragment);
                } else {

                    transaction.show(pager3Fragment);
                }
                break;
            case 3:
                pager4Image.setImageResource(R.drawable.ic_launcher);
                pager4Text.setTextColor(Color.BLACK);
                if (pager4Fragemnt == null) {

                    pager4Fragemnt = new Pager4Fragemnt();
                    transaction.add(R.id.content, pager4Fragemnt);
                } else {

                    transaction.show(pager4Fragemnt);
                }
                break;
            case 4:
                pager5Image.setImageResource(R.drawable.ic_launcher);
                pager5Text.setTextColor(Color.BLACK);
                if (pager5Fragemnt == null) {

                    pager5Fragemnt = new Pager5Fragment();
                    transaction.add(R.id.content, pager5Fragemnt);
                } else {

                    transaction.show(pager5Fragemnt);
                }
                break;
        }
        transaction.commit();

    }
    private void clearSelection(){
        pager1Image.setImageResource(R.drawable.menu_top_right);
        pager1Text.setTextColor(Color.parseColor("#fff"));
        pager2Image.setImageResource(R.drawable.menu_top_right);
        pager2Text.setTextColor(Color.parseColor("#fff"));
        pager3Image.setImageResource(R.drawable.menu_top_right);
        pager3Text.setTextColor(Color.parseColor("#fff"));
        pager4Image.setImageResource(R.drawable.menu_top_right);
        pager4Text.setTextColor(Color.parseColor("#fff"));
        pager5Image.setImageResource(R.drawable.menu_top_right);
        pager5Text.setTextColor(Color.parseColor("#fff"));
    }
    private void hideFragments(FragmentTransaction transaction){
        if(pager1Fragment !=null){
            transaction.hide(pager1Fragment);
        }
        if (pager2Fragment !=null){
            transaction.hide(pager2Fragment);
        }
        if (pager3Fragment !=null){
            transaction.hide(pager3Fragment);
        }
        if (pager4Fragemnt !=null){
            transaction.hide(pager4Fragemnt);
        }
        if (pager5Fragemnt !=null){
            transaction.hide(pager5Fragemnt);
        }
    }
}
