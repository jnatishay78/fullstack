package com.example.jewelicious.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {

    private Long userId;
    private String name;
    private String email;
    private String mobileNumber;

}