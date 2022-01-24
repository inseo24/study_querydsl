package com.example.querydsl

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/samples")
class SampleController(
    val sampleService: SampleService
) {
    @PostMapping
    fun createSample(@RequestBody request: SampleRequestDto) =
        sampleService.createSample(request)

    @PutMapping
    fun updateSample(@RequestBody request: SampleRequestDto) =
        sampleService.updateSample(request)
}