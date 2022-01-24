package com.example.querydsl

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@DynamicInsert
@DynamicUpdate
class SampleEntity (
    @Id
    val id: Int,
    var name: String? = null,
    var address: String? = null,
    var etc: String? = null
) {
    fun changeFields(
        name: String? = null,
        address: String? = null,
        etc: String? = null
    ) {
        name?.let { this.name = it }
        address?.let { this.address = it }
        etc?.let { this.etc = it }
    }
}