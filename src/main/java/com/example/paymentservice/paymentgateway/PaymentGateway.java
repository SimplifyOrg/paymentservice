package com.example.paymentservice.paymentgateway;

public interface PaymentGateway {
    public String generatePaymentLink(String order_id, Long amount);
}
