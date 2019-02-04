package com.boot.app.SpringBootJpaPostgresExample.exception;



import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class APIExceptionHandler {

  private ErrorMessageConfigurationManager errorMessageConfigurationManager;

  @ExceptionHandler(Exception.class)
  public ResponseEntity<APIError> handleGenericError(Exception ex) {

    String code = APIErrorConstants.INTERNAL_SERVER_ERROR_CODE;

    APIError apiError = new APIError();
    apiError.setErrors(
        Arrays.asList(
            new APIRequestError(
                code, this.errorMessageConfigurationManager.getErrorDetails(code))));
    return new ResponseEntity<>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
