package com.valle.ecommerce.checkout.config;

import com.valle.ecommerce.checkout.streaming.CheckoutCreatedSource;
import com.valle.ecommerce.checkout.streaming.PaymentDoneSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentDoneSink.class
})
public class StreamingConfig {
}