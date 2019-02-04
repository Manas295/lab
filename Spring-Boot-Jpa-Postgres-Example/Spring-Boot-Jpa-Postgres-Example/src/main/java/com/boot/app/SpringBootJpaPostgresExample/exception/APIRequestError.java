package com.boot.app.SpringBootJpaPostgresExample.exception;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.FieldError;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class APIRequestError {

  private String fieldName;

  private String code;

  private String message;

  public APIRequestError(FieldError error) {
    this.fieldName = error.getField();
    this.message = error.getDefaultMessage();
    this.code = error.getCode();
  }

  public APIRequestError(String code, String message) {
    this.message = message;
    this.code = code;
  }
}
