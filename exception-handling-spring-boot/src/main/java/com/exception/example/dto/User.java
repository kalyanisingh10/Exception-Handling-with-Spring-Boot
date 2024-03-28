package com.exception.example.dto;

import com.exception.example.common.UserStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {

    private String userName;
    private UserStatus userStatus;

}
