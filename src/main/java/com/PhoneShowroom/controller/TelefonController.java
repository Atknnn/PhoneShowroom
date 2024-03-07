package com.PhoneShowroom.controller;

import com.PhoneShowroom.dto.request.SaveTelefonRequestDto;
import com.PhoneShowroom.dto.response.FindAllTelefonResponseDto;
import com.PhoneShowroom.service.TelefonService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.PhoneShowroom.constants.RestApi.*;

@RestController
@RequestMapping(TELEFON)
@RequiredArgsConstructor
public class TelefonController {
    private final TelefonService telefonService;
    @PostMapping(SAVE)
    public ResponseEntity<Void> saveTelefon(@RequestBody @Valid SaveTelefonRequestDto dto){
        //@RequestBody anotasyonu, request body'nin içerik türünü tanımlamak için kullanılır.
        //@Valid -> girilen sifre kosullarini belirleme kisminda ise yariyor. Cevap donulmesini sagliyor.
        //@Valid anotasyonu ekleyerek apimize gelen alanlara belirlediğimiz kriterlerin doğruluğu kontrol edilmektedir.
        telefonService.save(dto);
        return ResponseEntity.ok().build();
    }
    @GetMapping(FINDALL)
    public ResponseEntity<FindAllTelefonResponseDto> findAllTelefon(){
        return ResponseEntity.ok(telefonService.findAllTelefon());
    }
}
