package com.example.innovace.mobilechat.model;

/**
 * Created by innovace on 25/1/18.
 */

public class User {
    String userNmae,PassWord,firstName,lastName;


    public User(String userName,String firstName,String lastName){
        this.userNmae = userName;
        this.firstName =firstName;
        this.lastName = lastName;

    }

    public User(String userNmae, String passWord) {
        this.userNmae = userNmae;
        PassWord = passWord;
    }



    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}
