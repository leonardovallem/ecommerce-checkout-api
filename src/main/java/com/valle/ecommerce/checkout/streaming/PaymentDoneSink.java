package com.valle.ecommerce.checkout.streaming;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface PaymentDoneSink {
    String INPUT = "payment-done-input";

    @Input(INPUT)
    SubscribableChannel input();
}
