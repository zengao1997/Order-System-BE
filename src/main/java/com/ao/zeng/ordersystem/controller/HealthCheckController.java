package com.ao.zeng.ordersystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aozeng
 */
@RestController
@RequestMapping("")
public class HealthCheckController {
    private static final String HEALTH_CHECK_MESSAGE = "Hi, I'm Aliveeee";

    @GetMapping("/health_check")
    public String getHealthCheckMessage() {
        return HEALTH_CHECK_MESSAGE;
    }
}
