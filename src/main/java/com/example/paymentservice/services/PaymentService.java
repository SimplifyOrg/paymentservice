package com.example.paymentservice.services;

import com.example.paymentservice.paymentgateway.PaymentGateway;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentGateway paymentGateway;

    PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(String order_id) throws RazorpayException {
        return paymentGateway.generatePaymentLink(order_id, 1000L);
    }
}
