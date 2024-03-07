package com.PhoneShowroom.repository.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VwTelefon {
    Long id;
    int yil;
    Long markaId;
    Long modelId;
}
