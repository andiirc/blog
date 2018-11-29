package com.sf.blog.services

import com.sf.blog.documents.Post

interface PostService {

    fun findByTitle(title: String): Post?

    fun findByBody(body: String): List<Post>?

    fun created(post: Post): Post
}