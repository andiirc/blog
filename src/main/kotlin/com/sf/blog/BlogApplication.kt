package com.sf.blog

import com.sf.blog.documents.Post
import com.sf.blog.enums.EntryStatusEnum
import com.sf.blog.repostories.PostRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogApplication(val postRepository: PostRepository): CommandLineRunner {
    override fun run(vararg args: String?) {
        postRepository.deleteAll()

        val post = Post(name = "Test", image = "/images/test", status = EntryStatusEnum.INT_EDIT.toString())
        postRepository.save(post)

        println("Post ID: ${post.id}")
        println("Post Name: ${post.name}")
        println("Post Estatus: ${post.status}" )

    }
}

fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args)
}
