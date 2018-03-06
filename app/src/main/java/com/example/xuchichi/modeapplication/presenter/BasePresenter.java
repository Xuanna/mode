package com.example.xuchichi.modeapplication.presenter;

/**
 * Created by xuchichi on 2018/3/4.
 */

public interface BasePresenter<T>{//对View进行绑定，是view和model的桥梁

    void attachView(T v);

    void detachView();


}
