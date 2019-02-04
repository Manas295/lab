package com.boot.app.SpringBootJpaPostgresExample.exception;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
@Component
public class ErrorMessageConfigurationManager {

  private Map<String, String> errorCodes = new HashMap<>();

  public String getErrorDetails(String code) {
    return this.errorCodes.get(code);
  }
}
