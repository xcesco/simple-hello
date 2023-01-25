package it.sample.hello.model

import com.fasterxml.jackson.annotation.JsonFormat
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.NotNull
import java.time.OffsetDateTime
import java.time.ZonedDateTime

class Greetings(
    val message: String,
    @field:NotNull
    @field:JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
    @field:Schema(
        type = "String",
        format = "date-time",
        example = "2023-01-25T12:32:02",
        required = true,
        nullable = false
    )
    val data: ZonedDateTime
) {
}