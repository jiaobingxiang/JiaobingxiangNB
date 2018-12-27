package com.bwie.jiaobingxiangnb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.bwie.jiaobingxiangnb.base.BaseActivity;

public class RegActivity extends BaseActivity {

    private EditText pass;
    private EditText phone;

    @Override
    protected void initLinsert() {
        findViewById(R.id.ok_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void initData() {

    }
    //初始化视图
    @Override
    protected void initView() {
        pass = findViewById(R.id.reg_pass);
        phone = findViewById(R.id.reg_phone);
    }

    @Override
    protected int initLayout() {
        return R.layout.activity_reg;
    }
}
