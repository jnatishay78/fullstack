package com.example.jewelicious.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileResponseDto {
    private Long CustomerId;
    private String name;
    private String email;
    private String mobileNumber;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private boolean emailUpdated;

}
