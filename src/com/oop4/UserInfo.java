package com.oop4;

public class UserInfo {
    String userId;
    String userPassword;
    String userName;
    String userAddress;
    String phoneNumber;

    // tip - 객체 생성될 때 가장 먼저 실행되는 부분은 생성자이다.

    public UserInfo (String id) {
        userId = id;
    }

    public UserInfo(String u, String password) {
        userId = u;
        userPassword = password;
    }

    // 생성자 직접 만들어보기
    public UserInfo(String u, String password, String name, String address, String phone) {
        userId = u;
        userPassword = password;
        userName = name;
        userAddress = address;
        phoneNumber = phone;
    }
}
