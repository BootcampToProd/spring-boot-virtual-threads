package com.bootcamptoprod.controller;

import com.bootcamptoprod.service.RequestProcessingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class SpringBootVirtualThreadsController {

    private final Logger log = LoggerFactory.getLogger(SpringBootVirtualThreadsController.class);

    private final RequestProcessingService requestProcessingService;

    public SpringBootVirtualThreadsController(RequestProcessingService requestProcessingService) {
        this.requestProcessingService = requestProcessingService;
    }

    @GetMapping("/hello")
    public String sendGreetings() {
        log.info("Hello endpoint. current thread: {}", Thread.currentThread());
        return "Hello, World!";
    }

    @GetMapping("/hello-with-delay")
    public String sendGreetingsWithDelay() throws InterruptedException {
        log.info("Hello endpoint with delay. current thread: {}", Thread.currentThread());
        return requestProcessingService.greetingsWithDelay();
    }

    @GetMapping("/hello-async")
    public CompletableFuture<String> sendGreetingsAsync() {
        log.info("Hello endpoint with async. current thread: {}", Thread.currentThread());
        return requestProcessingService.greetingsWithAsyncProcessing();
    }

}
