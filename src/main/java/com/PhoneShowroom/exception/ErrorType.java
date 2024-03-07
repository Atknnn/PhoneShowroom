package com.PhoneShowroom.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {
    SIFRE_UYUSMUYOR(1001,"Girilen şifreler uyuşmuyor.",HttpStatus.BAD_REQUEST),
    BAD_REQUEST_ERROR(3001,"Girilen bilgiler Hatali",HttpStatus.BAD_REQUEST),
    TUR_ERROR(1002,"mÜZİK Türü Bulunamadı.",HttpStatus.BAD_REQUEST);

    private int code;
    private String message;
    private HttpStatus httpStatus;

//    ErrorType(int code,String message,HttpStatus httpStatus){
//        this.code=code;
//        this.message=message;
//        this.httpStatus=httpStatus;
//    }
}
