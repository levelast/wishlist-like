package me.interview.wishlistlike

import org.springframework.boot.fromApplication
import org.springframework.boot.with

fun main(args: Array<String>) {
    fromApplication<WishlistLikeApplication>().with(TestcontainersConfiguration::class).run(*args)
}
