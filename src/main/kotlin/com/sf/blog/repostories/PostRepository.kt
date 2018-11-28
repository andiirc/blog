package com.sf.blog.repostories

import com.sf.blog.documents.Post
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "post")
interface PostRepository: MongoRepository<Post, String> {

    fun findByTitle(@Param("title") title: String): Post

    //fun findByCreated(@Param("created_at") create_at: String): List<Post>

    //fun findByCreated(create: String): List<Post>

}