package com.sf.blog.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Post(@Id val id: Int, val name: String, val Image: String, val status: String)