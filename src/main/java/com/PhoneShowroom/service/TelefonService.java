package com.PhoneShowroom.service;

import com.PhoneShowroom.dto.request.SaveTelefonRequestDto;
import com.PhoneShowroom.dto.response.FindAllTelefonResponseDto;
import com.PhoneShowroom.exception.ErrorType;
import com.PhoneShowroom.exception.PhoneShowroomException;
import com.PhoneShowroom.repository.TelefonRepository;
import com.PhoneShowroom.repository.entity.Telefon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TelefonService {
    private final TelefonRepository repository;
    public void save(SaveTelefonRequestDto dto){
        if (dto.getYil()>2015){
            throw new PhoneShowroomException(ErrorType.BAD_REQUEST_ERROR);
        }
        repository.save(
                Telefon.builder()
                        .id(1L)
                        .markaId(1L)
                        .yil(2021)
                        .modelId(1L)
                        .build()
        );
    }

    public List<Telefon> findAll(){
        return repository.findAll();
    }
    public FindAllTelefonResponseDto findAllTelefon() {

        return FindAllTelefonResponseDto.builder()
                .statusCode(100)
                .message("telefon goruntulendi")
                .data(repository.findAllFromTelefonView())
                .build();
    }

}
