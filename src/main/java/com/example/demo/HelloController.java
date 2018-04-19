package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public final class HelloController {

    @GetMapping
    public final String hello() throws UnknownHostException {
        return "Hello from " + InetAddress.getLocalHost().getHostAddress();
    }
}
