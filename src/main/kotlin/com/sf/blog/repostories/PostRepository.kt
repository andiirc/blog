package com.sf.blog.repostories

import com.sf.blog.documents.Post
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource
import java.util.UUID

@RepositoryRestResource(path = "post")
interface PostRepository: MongoRepository<Post, UUID> {

    @RestResource(path = "by-title")
    fun findByTitle(@Param("title") title: String): Post

    @RestResource(path = "by-body")
    fun findByBodyLike(@Param("body") body: String ): List<Post>

    //fun findByCreated(@Param("created_at") create_at: String): List<Post>


}