package com.sf.blog.documents

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "post")
data class Post(
        @Id val id: String = UUID.randomUUID().toString(),
        val name: String,
        val image: String,
        val status: String
        //@CreatedDate val created_at: Date
)