package com.eventor.api.domain.coupon;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
