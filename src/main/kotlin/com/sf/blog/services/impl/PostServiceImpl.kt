package com.sf.blog.services.impl

import com.sf.blog.documents.Post
import com.sf.blog.repostories.PostRepository
import com.sf.blog.services.PostService
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(val postRepository: PostRepository) : PostService{

    override fun findByName(name: String): Post?  = postRepository.findByName(name)

    //override fun finByCreated(created: String): List<Post?> = postRepository.findByCreated(created)

    override fun created(post: Post): Post = postRepository.save(post)

}