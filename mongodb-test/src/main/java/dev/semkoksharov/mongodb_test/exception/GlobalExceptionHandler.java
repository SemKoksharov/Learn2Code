package dev.semkoksharov.mongodb_test.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

@ControllerAdvice
public class GlobalExceptionHandler {

    public record Error(String status, String message, String timestamp, String exception, String stackTrace){}
    private String timestampFormatted =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ITALY).format(new Date());

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Error> handleRuntimeExceptions(RuntimeException ex){
        return createErrorBody(ex, HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<Error> createErrorBody(RuntimeException ex, HttpStatus httpStatus){

        String status = httpStatus.toString();
        String message = ex.getMessage();
        String timestamp = this.timestampFormatted;
        String exception = ex.getClass().getSimpleName();
        String stackTrace = Arrays.toString(ex.getStackTrace());

        Error error = new Error(status, message, timestamp, exception, stackTrace);

        return ResponseEntity.status(httpStatus).body(error);
    }
}
