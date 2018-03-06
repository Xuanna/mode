package com.example.xuchichi.modeapplication.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xuchichi.modeapplication.R;
import com.example.xuchichi.modeapplication.view.UpLoadView;

public class LoadImageActivity extends AppCompatActivity implements UpLoadView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_image);
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void loadImage() {

    }
}
