package com.learning.cloud.vender.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CloudVendorExceptionHandler {


    @ExceptionHandler(value={CloudVendorNotFoundException.class})
    public ResponseEntity<?> handleCloudVendorException(CloudVendorNotFoundException cloudVendorNotFoundException){
        CloudVendorException cloudVendorException=new CloudVendorException(
          cloudVendorNotFoundException.getMessage(),
                cloudVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND

        );
        return new ResponseEntity<>(cloudVendorException,HttpStatus.NOT_FOUND);
    }
}
