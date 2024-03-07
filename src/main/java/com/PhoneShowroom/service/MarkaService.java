package com.PhoneShowroom.service;

import com.PhoneShowroom.dto.request.SaveMarkaRequestDto;
import com.PhoneShowroom.exception.ErrorType;
import com.PhoneShowroom.exception.PhoneShowroomException;
import com.PhoneShowroom.repository.MarkaRepository;
import com.PhoneShowroom.repository.entity.Marka;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkaService {
    private final MarkaRepository repository;
    public void save(SaveMarkaRequestDto dto){
        if (dto.getName()!=null){
            throw new PhoneShowroomException(ErrorType.BAD_REQUEST_ERROR);
        }
        repository.save(
                Marka.builder()
                        .id(1L)
                        .name("Samsung")
                        .build()
        );
    }
}
