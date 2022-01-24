package com.example.querydsl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/querydsl/SampleController;", "", "sampleService", "Lcom/example/querydsl/SampleService;", "(Lcom/example/querydsl/SampleService;)V", "getSampleService", "()Lcom/example/querydsl/SampleService;", "createSample", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/querydsl/SampleResponseDto;", "request", "Lcom/example/querydsl/SampleRequestDto;", "updateSample", "querydsl"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/samples"})
@org.springframework.web.bind.annotation.RestController()
public class SampleController {
    @org.jetbrains.annotations.NotNull()
    private final com.example.querydsl.SampleService sampleService = null;
    
    public SampleController(@org.jetbrains.annotations.NotNull()
    com.example.querydsl.SampleService sampleService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.example.querydsl.SampleService getSampleService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping()
    public org.springframework.http.ResponseEntity<com.example.querydsl.SampleResponseDto> createSample(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.example.querydsl.SampleRequestDto request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PutMapping()
    public org.springframework.http.ResponseEntity<com.example.querydsl.SampleResponseDto> updateSample(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.example.querydsl.SampleRequestDto request) {
        return null;
    }
}