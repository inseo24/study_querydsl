package com.example.querydsl

import org.modelmapper.ModelMapper
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.*
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class SampleService(
    val sampleRepository: SampleRepository,
    val modelMapper: ModelMapper
) {
    @Transactional
    fun updateSample(request: SampleRequestDto): ResponseEntity<SampleResponseDto> {
        val updatedEntity = sampleRepository.findByIdOrNull(request.id)?.apply {
            this.changeFields(    // 원하는 필드의 데이터만 파라미터로 넘긴다
                address = request.address,
                etc = request.etc
            )
        }
        return ok(modelMapper.map(updatedEntity, SampleResponseDto::class.java))
    }

    fun createSample(request: SampleRequestDto): ResponseEntity<SampleResponseDto> {
        val savedEntity = sampleRepository.save(modelMapper.map(request, SampleEntity::class.java))
        return ok(modelMapper.map(savedEntity, SampleResponseDto::class.java))
    }
}