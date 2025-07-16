package com.example.jewelicious.service.impl;

import com.example.jewelicious.dto.ContactRequestDto;
import com.example.jewelicious.entity.Contact;
import com.example.jewelicious.repository.ContactRepository;
import com.example.jewelicious.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {

    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
            Contact contact = transformToEntity(contactRequestDto);
            contactRepository.save(contact);
            return true;
    }

    private Contact transformToEntity(ContactRequestDto contactRequestDto) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, contact);
        return contact;
    }
}
