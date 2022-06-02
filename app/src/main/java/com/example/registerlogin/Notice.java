package com.example.registerlogin;

public class Notice {
    String notice;
    String name;
    String date;

    public Notice(String notice, String name, String date){
        this.notice = notice;
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getNotice(){
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}