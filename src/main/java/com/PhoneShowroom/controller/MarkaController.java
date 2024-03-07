package com.PhoneShowroom.controller;

import com.PhoneShowroom.dto.request.SaveMarkaRequestDto;
import com.PhoneShowroom.service.MarkaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.PhoneShowroom.constants.RestApi.MARKA;
import static com.PhoneShowroom.constants.RestApi.SAVE;

@RestController
@RequestMapping(MARKA)
@RequiredArgsConstructor
public class MarkaController {
    private final MarkaService markaService;
    @PostMapping(SAVE)
    public ResponseEntity<Void> saveMarka(@RequestBody @Valid SaveMarkaRequestDto dto){
        //@RequestBody anotasyonu, request body'nin içerik türünü tanımlamak için kullanılır.
        //@Valid -> girilen sifre kosullarini belirleme kisminda ise yariyor. Cevap donulmesini sagliyor.
        //@Valid anotasyonu ekleyerek apimize gelen alanlara belirlediğimiz kriterlerin doğruluğu kontrol edilmektedir.
        markaService.save(dto);
        return ResponseEntity.ok().build();
    }
}
