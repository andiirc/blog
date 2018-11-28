package com.sf.blog.services.impl

import com.sf.blog.documents.Post
import com.sf.blog.repostories.PostRepository
import com.sf.blog.services.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(val postRepository: PostRepository) : PostService{

    override fun findByTitle(title: String): Post  = postRepository.findByTitle(title)

    //override fun findByCreated(created: String): List<Post>? = postRepository.findByCreated(created)

    override fun created(post: Post): Post = postRepository.save(post)

}