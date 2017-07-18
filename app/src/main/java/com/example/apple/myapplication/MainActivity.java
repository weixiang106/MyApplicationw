package com.example.apple.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apple.myapplication.bean.DaoMaster;
import com.example.apple.myapplication.bean.DaoSession;
import com.example.apple.myapplication.bean.UserBean;
import com.example.apple.myapplication.bean.UserBeanDao;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private UserBeanDao userBeanDao;
    private Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              insert();

            }
        });
        initView();

    }
    private void initView(){
        DaoMaster.DevOpenHelper devOpenHelper = new
                DaoMaster.DevOpenHelper(
                getApplicationContext(),"level.db",null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        userBeanDao = daoSession.getUserBeanDao();

    }
    //添加数据
    private void insert(){
        UserBean user = new UserBean(12, "zhangsan","张三");
        userBeanDao.insert(user);

        List<UserBean> list = userBeanDao.queryBuilder()
                .where(UserBeanDao.Properties.Id.between(2, 13)).limit(5).build().list();
        for (int i = 0; i < list.size(); i++) {

            Log.d("google_lenve", "search: " + list.get(i).toString());
        }

    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }



}
