package com.example.mvvm.viewmodel;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by xuchichi on 2018/3/6.
 * M层到V层，和V层到M层之间传递数据
 */

public class MainViewModel {
    private String userName;
    private String pwd;

    private Context context;

    public MainViewModel(Context context) {
        this.context = context;
    }

    public TextWatcher setNameTextChangedListener() {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                userName = s.toString();
                Log.e("name",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
    }


    public TextWatcher setPwdTextChangedListener() {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.e("pwd",s.toString());
                pwd = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
    }


    public void login(View view) {
        Log.e("login","username:"+userName+"=pwd="+pwd);
        if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(pwd)) {
            if (userName.equals("zhang") && pwd.equals("123456")) {
                Toast.makeText(context, "登陆成功", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(context, "用户名或密码错误", Toast.LENGTH_LONG).show();
            }

        } else {
            Toast.makeText(context, "用户名或者密码不能为空", Toast.LENGTH_LONG).show();
        }

    }
}
