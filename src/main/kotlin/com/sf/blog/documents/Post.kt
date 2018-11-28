package com.sf.blog.documents

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime
import java.util.UUID

@Document(collection = "post")
data class Post(
        @Id val id: String = UUID.randomUUID().toString(),
        val image: String,
        val title: String,
        val body: String,
        val status: String,
        @CreatedDate
        @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        val created_at: LocalDateTime =  LocalDateTime.now().withNano(0)
)