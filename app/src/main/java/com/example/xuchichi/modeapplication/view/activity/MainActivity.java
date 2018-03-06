package com.example.xuchichi.modeapplication.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xuchichi.modeapplication.R;
import com.example.xuchichi.modeapplication.presenter.LoginPresenterImpl;
import com.example.xuchichi.modeapplication.view.LoginView;

/**
 * MVP核心思想
 * 将Activit中的ui逻辑抽象成View，将业务逻辑抽象成Presenter
 * 登陆：ui逻辑 登陆成功，失败 谈吐司
 *      业务逻辑 登陆
 */

public class MainActivity extends AppCompatActivity implements LoginView {
    LoginPresenterImpl basePresenter;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basePresenter=new LoginPresenterImpl();
        basePresenter.attachView(this);
        textView=findViewById(R.id.tvLogin);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basePresenter.login("zhang","123456");
            }
        });
    }

    @Override
    public void loginSuccess() {
        showToast("登陆成功！");

    }

    @Override
    public void loginFailed() {
        showToast("登陆失败！");
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePresenter.detachView();
    }
}
