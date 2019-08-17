package com.example.cache.springcache.config;

 import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@EnableCaching
@Configuration
public class CacheConfiguration {
  private static EhCacheManagerFactoryBean cacheManagerfactoryBean;

  @Bean
  public CacheManager getEhCacheManager(EhCacheManagerFactoryBean ehCacheManagerFactoryBean) {
    return new EhCacheCacheManager(ehCacheManagerFactoryBean.getObject());
  }

  @Bean
  public EhCacheManagerFactoryBean getEhCacheFactory() {
    cacheManagerfactoryBean = new EhCacheManagerFactoryBean();
    cacheManagerfactoryBean.setShared(true);
    cacheManagerfactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
    return cacheManagerfactoryBean;
  }

  @Bean("userKeyGenerator")
  public KeyGenerator userKeyGenerator() {
    return (target, method, params) -> {
      String key = target.getClass().getSimpleName() + "::" + method.getName() + "::"
          + Arrays.asList(params).stream().map(Object::toString).collect(Collectors.joining("::"));
      System.out.println(key);
      return key;
    };
  }


}
