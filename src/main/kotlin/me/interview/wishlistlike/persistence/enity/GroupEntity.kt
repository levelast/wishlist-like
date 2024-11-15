package me.interview.wishlistlike.persistence.enity

import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate

@Table(name = "groups")
data class GroupEntity(
    @Id
    val id: Long,
    val accountId: Long,
    val name: String,
    @CreatedDate
    val createdAt: Instant,
    @LastModifiedDate
    val updateAt: Instant,
)
