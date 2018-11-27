package com.sf.blog.services

import com.sf.blog.documents.Post

interface PostService {

    fun findByName(name: String): Post?

    //fun finByCreated(created: String): Post?

    fun created(post: Post): Post
}