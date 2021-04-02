package com.valle.ecommerce.checkout.listener;

import com.valle.ecommerce.checkout.entity.CheckoutEntity;
import com.valle.ecommerce.checkout.repository.CheckoutRepository;
import com.valle.ecommerce.checkout.streaming.PaymentDoneSink;
import com.valle.ecommerce.payment.event.PaymentDoneEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentDoneListener {
    private final CheckoutRepository checkoutRepository;

    @StreamListener(PaymentDoneSink.INPUT)
    public void handler(PaymentDoneEvent event) {
        final var checkoutEntity = checkoutRepository.findByCode(event
                .getCheckoutCode()
                .toString())
                .orElseThrow();
        checkoutEntity.setStatus(CheckoutEntity.Status.APPROVED);
        checkoutRepository.save(checkoutEntity);
    }
}
