package it.sample.hello.web

import org.springframework.core.convert.ConversionFailedException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalControllerExceptionHandler {
    @ExceptionHandler(ConversionFailedException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleConnversion(ex: RuntimeException): ResponseEntity<String> {
        return ResponseEntity(ex.message, HttpStatus.BAD_REQUEST)
    } //    @ExceptionHandler(BookNotFoundException.class)
    //    @ResponseStatus(HttpStatus.NOT_FOUND)
    //    public ResponseEntity<String> handleBookNotFound(RuntimeException ex) {
    //        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    //    }
}