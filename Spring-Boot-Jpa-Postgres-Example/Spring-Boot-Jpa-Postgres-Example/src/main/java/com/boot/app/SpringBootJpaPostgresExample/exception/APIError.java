package com.boot.app.SpringBootJpaPostgresExample.exception;



import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class APIError {

  private List<APIRequestError> errors;
}
