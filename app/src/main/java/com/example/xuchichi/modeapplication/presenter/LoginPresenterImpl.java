package com.example.xuchichi.modeapplication.presenter;

import android.text.TextUtils;

import com.example.xuchichi.modeapplication.view.LoginView;

/**
 * Created by xuchichi on 2018/3/4.
 */

public class LoginPresenterImpl implements LoginPresenter{

    private LoginView loginView;

    @Override
    public void attachView(LoginView loginView) {
        this.loginView=loginView;
    }

    @Override
    public void detachView() {
            loginView=null;
    }

    @Override
    public void login(String name, String pwd) {
        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(pwd)){
            if ("zhang".equals(name) && "123456".equals(pwd)){
                loginView.loginSuccess();
            }else{
                loginView.loginFailed();
            }

        }else{
            loginView.showToast("用户名或密码不能为空！");
        }

    }
}
