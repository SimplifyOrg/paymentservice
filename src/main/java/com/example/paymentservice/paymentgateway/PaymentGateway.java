package com.example.paymentservice.paymentgateway;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    public String generatePaymentLink(String order_id, Long amount) throws RazorpayException;
}
