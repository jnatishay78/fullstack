package com.example.jewelicious.service;

import com.example.jewelicious.dto.ContactRequestDto;
import com.example.jewelicious.dto.ProductDto;

import java.util.List;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);
}