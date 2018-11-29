package com.sf.blog.documents

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.format.annotation.DateTimeFormat
import java.text.SimpleDateFormat
import java.util.*

@Document(collection = "post")
data class Post(
        @Id val id: UUID = UUID.randomUUID(),
        val image: String,
        val title: String,
        val body: String,
        val status: String,
        @CreatedDate
        @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        val createdAt: String =  SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Date())
)