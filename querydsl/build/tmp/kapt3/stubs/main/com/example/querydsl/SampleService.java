package com.example.querydsl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\fH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/querydsl/SampleService;", "", "sampleRepository", "Lcom/example/querydsl/SampleRepository;", "(Lcom/example/querydsl/SampleRepository;)V", "getSampleRepository", "()Lcom/example/querydsl/SampleRepository;", "createSample", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/querydsl/SampleEntity;", "request", "updateSample", "Lcom/example/querydsl/SampleDto;", "querydsl"})
@org.springframework.stereotype.Service()
public class SampleService {
    @org.jetbrains.annotations.NotNull()
    private final com.example.querydsl.SampleRepository sampleRepository = null;
    
    public SampleService(@org.jetbrains.annotations.NotNull()
    com.example.querydsl.SampleRepository sampleRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.example.querydsl.SampleRepository getSampleRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    public org.springframework.http.ResponseEntity<com.example.querydsl.SampleEntity> updateSample(@org.jetbrains.annotations.NotNull()
    com.example.querydsl.SampleDto request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<com.example.querydsl.SampleEntity> createSample(@org.jetbrains.annotations.NotNull()
    com.example.querydsl.SampleEntity request) {
        return null;
    }
}