package com.example.apple.myapplication.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by apple on 2017/7/18.
 * 数据库引入成功后，在使用之前，我们还得先来创建一个实体类
 */
@Entity
public class UserBean {
    @Id
    private long id;
    @Property(nameInDb = "USERNAME")
    private String username;
    @Property(nameInDb = "NICKNAME")
    private String nickname;
    public String getNickname() {
        return this.nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Generated(hash = 796078739)
    public UserBean(long id, String username, String nickname) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
    }
    @Generated(hash = 1203313951)
    public UserBean() {
    }
}
