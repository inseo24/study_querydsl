package com.example.querydsl

import com.querydsl.jpa.impl.JPAQueryFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import javax.persistence.EntityManager
import javax.transaction.Transactional

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@Transactional
class QuerydslApplicationTests(
    private val entityManager: EntityManager
) {

    @Test
    internal fun `querydsl setting test`() {
        val sampleEntity = SampleEntity(1, "name 1", "add 1", "etc 1")
        entityManager.persist(sampleEntity)

        val query = JPAQueryFactory(entityManager)

        val qSampleEntity = QSampleEntity.sampleEntity

        val findSampleEntity = query
            .selectFrom(qSampleEntity)
            .where(qSampleEntity.name.eq("name 1"))
            .fetchOne()!!

        assertThat(findSampleEntity.id).isNotNull
        assertThat(findSampleEntity.name).isEqualTo("name 1")
    }

}
