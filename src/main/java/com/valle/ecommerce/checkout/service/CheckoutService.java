package com.valle.ecommerce.checkout.service;

import com.valle.ecommerce.checkout.controller.checkout.CheckoutRequest;
import com.valle.ecommerce.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
