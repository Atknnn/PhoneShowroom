package com.PhoneShowroom.dto.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveTelefonRequestDto {
    Long id;
    @Size(min = 2015)
    int yil;
    Long markaId;
    Long modelId;
}
