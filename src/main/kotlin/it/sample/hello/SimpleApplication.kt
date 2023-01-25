package it.sample.hello

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@OpenAPIDefinition(info = Info(title = "Simple Hello API", version = "2.0", description = "Simple Hello Information"))
class SimpleApplication

fun main(args: Array<String>) {
    runApplication<SimpleApplication>(*args)
}