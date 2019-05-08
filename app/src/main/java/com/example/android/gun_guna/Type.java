package com.example.android.gun_guna;

import java.util.ArrayList;

public class Type {

    String mtype;
    int mmusicid;


    Type(String type,int musicid)
    {
        mtype=type;
        mmusicid=musicid;
    }

    public String getType()
    {
        return mtype;
    }

    public int getMusicid(){
        return mmusicid;
    };


}
