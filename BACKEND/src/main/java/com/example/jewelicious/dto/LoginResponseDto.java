package com.example.jewelicious.dto;

public record LoginResponseDto(String message, UserDto user, String jwtToken) {
}
