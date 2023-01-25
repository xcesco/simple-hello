package it.sample.hello.web

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import it.sample.hello.model.Greetings
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime
import java.time.ZonedDateTime

@RestController
@RequestMapping("/api")
class HelloController {

    @Operation(summary = "Simple app")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200", description = "Greetings from Simple App", content = [
                    (Content(
                        mediaType = "application/json", array = (
                                ArraySchema(schema = Schema(implementation = Greetings::class)))
                    ))]
            )]
        // ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
        // ApiResponse(responseCode = "404", description = "Did not find any Foos", content = [Content()])]
    )
    @GetMapping("/hello")
    fun home(@Parameter name: String?): Greetings {
        return Greetings("Hello ${name ?: DEFAULT_NAME} World!!", ZonedDateTime.now())
    }

    companion object {
        const val DEFAULT_NAME = "Docker"
    }

}