package com.example.jewelicious.service;

import com.example.jewelicious.dto.ProfileRequestDto;
import com.example.jewelicious.dto.ProfileResponseDto;

public interface IProfileService {

    ProfileResponseDto getProfile();

    ProfileResponseDto updateProfile(ProfileRequestDto profileRequestDto);
}
