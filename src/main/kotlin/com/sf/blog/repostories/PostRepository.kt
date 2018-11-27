package com.sf.blog.repostories

import com.sf.blog.documents.Post
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository

@RepositoryRestResource(path = "post")
interface PostRepository: MongoRepository<Post, String> {

    fun findByName(name: String): Post

    //fun findByCreated(create: String): List<Post>

}