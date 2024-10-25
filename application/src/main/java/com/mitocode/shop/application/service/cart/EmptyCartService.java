package com.mitocode.shop.application.service.cart;

import com.mitocode.shop.application.port.in.cart.EmptyCartUseCase;
import com.mitocode.shop.application.port.out.persistence.CartRepository;
import com.mitocode.shop.model.customer.CustomerId;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class EmptyCartService implements EmptyCartUseCase {

    private final CartRepository cartRepository;

    @Override
    public void emptyCart(CustomerId customerId){
        Objects.requireNonNull(customerId, "'customerId' must not be null");

        cartRepository.deleteByCustomerId(customerId);
    }
}