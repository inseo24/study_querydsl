package com.example.querydsl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/example/querydsl/SampleService;", "", "sampleRepository", "Lcom/example/querydsl/SampleRepository;", "modelMapper", "Lorg/modelmapper/ModelMapper;", "(Lcom/example/querydsl/SampleRepository;Lorg/modelmapper/ModelMapper;)V", "getModelMapper", "()Lorg/modelmapper/ModelMapper;", "getSampleRepository", "()Lcom/example/querydsl/SampleRepository;", "createSample", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/querydsl/SampleResponseDto;", "request", "Lcom/example/querydsl/SampleRequestDto;", "updateSample", "querydsl"})
@org.springframework.stereotype.Service()
public class SampleService {
    @org.jetbrains.annotations.NotNull()
    private final com.example.querydsl.SampleRepository sampleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final org.modelmapper.ModelMapper modelMapper = null;
    
    public SampleService(@org.jetbrains.annotations.NotNull()
    com.example.querydsl.SampleRepository sampleRepository, @org.jetbrains.annotations.NotNull()
    org.modelmapper.ModelMapper modelMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.example.querydsl.SampleRepository getSampleRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.modelmapper.ModelMapper getModelMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    public org.springframework.http.ResponseEntity<com.example.querydsl.SampleResponseDto> updateSample(@org.jetbrains.annotations.NotNull()
    com.example.querydsl.SampleRequestDto request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<com.example.querydsl.SampleResponseDto> createSample(@org.jetbrains.annotations.NotNull()
    com.example.querydsl.SampleRequestDto request) {
        return null;
    }
}