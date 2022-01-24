package com.example.querydsl

import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.*
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class SampleService(
    val sampleRepository: SampleRepository
) {
    @Transactional
    fun updateSample(request: SampleDto) : ResponseEntity<SampleEntity> {
        val response = sampleRepository.findByIdOrNull(request.id)?.apply {
            this.changeFields(    // 원하는 필드의 데이터만 파라미터로 넘긴다
                address = request.address,
                etc = request.etc
            )
        }
        return ok(response)
    }

    fun createSample(request: SampleEntity): ResponseEntity<SampleEntity> {
        val response = sampleRepository.save(request)
        return ok(response)
    }
}