package com.sf.blog.dtos

import com.sf.blog.enums.EntryStatusEnum
import org.hibernate.validator.constraints.Length
import org.springframework.format.annotation.DateTimeFormat
import java.util.*
import javax.validation.constraints.NotEmpty

data class PostDto(
        val id: String,
        @get:NotEmpty(message = "El nombre es requerido")
        @get:Length(min=5, message = "El nombre debe tener almenos cinco caracteres")
        val name: String,
        @get:NotEmpty(message = "La imagen es requerida")
        val image: String,
        @get:NotEmpty(message = "El estado es requerido")
        val status: String
        //@get:NotEmpty(message = "La fecha es requerida")
        //@get:DateTimeFormat()
        //val created_at: Date
        )