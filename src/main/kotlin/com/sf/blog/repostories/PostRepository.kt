package com.sf.blog.repostories

import com.sf.blog.documents.Post
import org.springframework.data.mongodb.repository.MongoRepository

interface PostRepository: MongoRepository<Post, Int> {

    fun findByName(name: String): Post

}