package com.example.xuchichi.modeapplication.presenter;

import com.example.xuchichi.modeapplication.view.LoginView;

/**
 * Created by xuchichi on 2018/3/4.
 */

public interface LoginPresenter extends BasePresenter<LoginView>{

    void login(String name, String pwd);
}
