package com.eventor.api.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventor.api.domain.coupon.Coupon;
import com.eventor.api.domain.coupon.CouponRequestDTO;
import com.eventor.api.services.CouponService;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping("/event/{eventId}")
    public ResponseEntity<Coupon> addCouponsToEvent(@PathVariable UUID eventId, @RequestBody CouponRequestDTO data) {
        Coupon coupons = couponService.addCouponToEvent(eventId, data);
        return ResponseEntity.ok(coupons);
    }
}