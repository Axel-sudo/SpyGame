package com.example.spygame.models;

public class Commentaire {
    private String message_test;
    private String userid;

    public Commentaire () {}

    public Commentaire(String message_test, String userid){
        this.message_test = message_test;
        this.userid = userid;


    }


    public String getMessage_test() {
        return message_test;
    }

    public void setMessage_test(String message_test) {
        this.message_test = message_test;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String toString() {
        return "Message : " + this.message_test + "Userid: " + this.userid ;
    }
}
