package com.sf.blog.dtos

import org.hibernate.validator.constraints.Length
import java.util.UUID
import javax.validation.constraints.NotEmpty

data class PostDto(
        val id: UUID,
        @get:NotEmpty(message = "El nombre es requerido")
        @get:Length(min=5, message = "El nombre debe tener almenos cinco caracteres")
        val title: String,
        @get:NotEmpty(message = "La imagen es requerida")
        val image: String,
        @get:NotEmpty(message = "El contenido es requerido")
        val body: String,
        @get:NotEmpty(message = "El estado es requerido")
        val status: String
)