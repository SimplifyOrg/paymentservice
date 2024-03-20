package com.example.paymentservice.controllers;

import com.example.paymentservice.dtos.PaymentRequestDTO;
import com.example.paymentservice.dtos.PaymentResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @PostMapping("/")
    public PaymentResponseDTO initiatePayment(@RequestBody PaymentRequestDTO request) {
        return null;
    }
}
