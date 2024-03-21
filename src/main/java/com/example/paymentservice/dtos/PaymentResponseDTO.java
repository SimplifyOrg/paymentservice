package com.example.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentResponseDTO {
    public String status;
    public String paymentLink;
}
