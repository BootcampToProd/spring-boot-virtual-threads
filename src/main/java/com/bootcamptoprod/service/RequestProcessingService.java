package com.bootcamptoprod.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class RequestProcessingService {

    private final Logger log = LoggerFactory.getLogger(RequestProcessingService.class);

    @Async
    public CompletableFuture<String> greetingsWithAsyncProcessing() {
        log.info("Async request processing. current thread: {}", Thread.currentThread());
        return CompletableFuture.completedFuture("Hello, World!");
    }

    public String greetingsWithDelay() throws InterruptedException {
        log.info("Request processing with delay. current thread: {}", Thread.currentThread());
        Thread.sleep(3000);
        return "Hello, World!";
    }
}
