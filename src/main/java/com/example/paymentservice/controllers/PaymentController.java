package com.example.paymentservice.controllers;

import com.example.paymentservice.dtos.PaymentRequestDTO;
import com.example.paymentservice.services.PaymentService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("/")
    public String initiatePayment(@RequestBody PaymentRequestDTO request) throws RazorpayException {
        return paymentService.initiatePayment(request.order_id);

    }
}
