package com.teoman.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoInvoiceRequest {

    @Positive
    private double amount;

    @NotBlank
    private String productName;

    @NotBlank
    private String billNo;
}
