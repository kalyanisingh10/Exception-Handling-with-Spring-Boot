package com.exception.example.entity;


import com.exception.example.common.UserStatus;
import jakarta.persistence.*;

@Entity
@Table(name="user")
public class UserEntity {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String userName;
    private String password;
    private UserStatus userStatus;


    public UserEntity(){

    }
    public UserEntity(Long id, String userName, String password, UserStatus userStatus) {
        Id = id;
        this.userName = userName;
        this.password = password;
        this.userStatus = userStatus;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }
}
