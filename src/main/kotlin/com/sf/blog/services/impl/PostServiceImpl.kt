package com.sf.blog.services.impl

import com.sf.blog.documents.Post
import com.sf.blog.repostories.PostRepository
import com.sf.blog.services.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(val postRepository: PostRepository) : PostService{


    override fun findByTitle(title: String): Post  = postRepository.findByTitle(title)

    override fun findByBody(body: String): List<Post>? = postRepository.findByBodyLike(body)

    override fun created(post: Post): Post = postRepository.save(post)

}