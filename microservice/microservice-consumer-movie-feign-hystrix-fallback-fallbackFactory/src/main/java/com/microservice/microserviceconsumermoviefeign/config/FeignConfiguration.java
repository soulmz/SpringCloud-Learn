package com.microservice.microserviceconsumermoviefeign.config;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/11/10
 * @since
 */
//@Configuration
public class FeignConfiguration {
    /**
     * 将契约改为feign原生的默认契约。这样就可以使用feign自带的注解了
     * @return 默认的feign契约
     */
//    @Bean
//    public Contract feignContract(){
//        return new feign.Contract.Default();
//    }
    // 基于Http 认证
    /*@Bean
    BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("user","password");
    }*/

}
