package com.PhoneShowroom.repository.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_telefon")
public class Telefon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int yil;
    Long markaId;
    Long modelId;
}
