package com.example.apple.myapplication.application;


import android.app.Application;

import com.example.apple.myapplication.bean.DaoMaster;
import com.example.apple.myapplication.bean.DaoSession;
import com.example.apple.myapplication.bean.UserBeanDao;

/**
 * Created by apple on 2017/7/18.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new
                DaoMaster.DevOpenHelper(
                getApplicationContext(),"level.db",null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        UserBeanDao userBeanDao = daoSession.getUserBeanDao();


    }
}
