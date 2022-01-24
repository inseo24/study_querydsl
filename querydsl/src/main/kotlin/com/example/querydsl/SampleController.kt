package com.example.querydsl

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/samples")
class SampleController(
    val sampleService: SampleService
) {
    @PostMapping
    fun createSample(@RequestBody request: SampleEntity) =
        sampleService.createSample(request)

    @PutMapping
    fun updateSample(@RequestBody request: SampleDto) =
        sampleService.updateSample(request)
}