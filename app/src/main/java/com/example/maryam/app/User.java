package com.example.maryam.app;

/**
 * Created by Maryam on 5/3/2017.
 */
public class User {
    String name;
    String phone;
    int img;

    public User(String name,String phone,int img){
        this.name=name;
        this.phone=phone;
        this.img=img;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){this.name=name;}

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone){this.phone=phone;}

    public int getImg() {
        return img;
    }
    public void setImg(int img){this.img=img;}
}
