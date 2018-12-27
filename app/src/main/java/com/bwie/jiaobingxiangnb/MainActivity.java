package com.bwie.jiaobingxiangnb;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.bwie.jiaobingxiangnb.base.BaseActivity;
import com.bwie.jiaobingxiangnb.util.HttpUrl;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private EditText phone;
    private EditText pwd;
    private String mPath = "";
    @Override
    protected void initLinsert() {

    }

    @Override
    protected void initData() {

    }
    //初始化组件
    @Override
    protected void initView() {
        phone = findViewById(R.id.login_phone);
        pwd = findViewById(R.id.login_pass);
        //设置点击监听
        findViewById(R.id.login_button).setOnClickListener(this);
        findViewById(R.id.reg_button).setOnClickListener(this);
    }
    //展示的布局
    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_button:
                break;
            case R.id.reg_button:
                //跳转
                startActivity(new Intent(MainActivity.this,RegActivity.class));
                break;
        }
    }
    class MyAsync extends AsyncTask<Integer,Integer,String>{
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.i("123123", "onPostExecute: "+s);
        }

        @Override
        protected String doInBackground(Integer... integers) {
            return HttpUrl.getHttpPost(mPath);
        }
    }
}
