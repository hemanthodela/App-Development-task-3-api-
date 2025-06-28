package com.makeeasy.retrofitfirst;

public class modelclass {
    int userId , id;
    String title,body;

    public modelclass(int userId,int id,String titel,String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getId(){
        return id;
    }
}
