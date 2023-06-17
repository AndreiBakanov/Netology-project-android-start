package ru.netology.nmedia.dto

data class Post(
    val id: Long,
    val author: String,
    val published: String,
    val content: String,
    var likedByMe: Boolean,
    var likes: String,
    var repostedByMe: Boolean,
    var reposts: String,
    var video: String? = null
)