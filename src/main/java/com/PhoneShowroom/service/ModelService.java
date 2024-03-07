package com.PhoneShowroom.service;

import com.PhoneShowroom.dto.request.SaveModelRequestDto;
import com.PhoneShowroom.exception.ErrorType;
import com.PhoneShowroom.exception.PhoneShowroomException;
import com.PhoneShowroom.repository.ModelRepository;
import com.PhoneShowroom.repository.entity.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository repository;
    public void save(SaveModelRequestDto dto){
        if (dto.getName()!=null){
            throw new PhoneShowroomException(ErrorType.BAD_REQUEST_ERROR);
        }
        repository.save(
                Model.builder()
                        .id(1L)
                        .name("S20")
                        .build()
        );
    }

}
