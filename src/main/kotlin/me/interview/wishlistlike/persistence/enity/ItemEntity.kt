package me.interview.wishlistlike.persistence.enity

import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.Instant

@Table(name = "items")
data class ItemEntity(
    @Id
    val id: Long,
    val articleId: Long,
    val groupId: Long,
    val accountId: Long,
    @CreatedDate
    val createdAt: Instant,
    @LastModifiedDate
    val updateAt: Instant,
)
