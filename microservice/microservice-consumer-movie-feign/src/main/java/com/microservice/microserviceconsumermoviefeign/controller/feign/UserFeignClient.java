package com.microservice.microserviceconsumermoviefeign.controller.feign;

import com.microservice.microserviceconsumermoviefeign.config.FeignConfiguration;
import com.microservice.microserviceconsumermoviefeign.domain.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign 配置类
 * FeignClient加上 configuration 即可使用Feign默认的配置
 * 详情请看 @see #FeignConfiguration
 *
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/11/10
 * @since 1.0
 */
@FeignClient(name = "microservice-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {
    /**
     * 获取用户信息
     *
     * @param id
     * @return
     */
/*    @GetMapping("/{id}")
    User findById(@PathVariable("id") Long id);*/

    /**
     * 使用Feign自带的注解@RequestLine
     * @see https://github.com/OpenFeign/feign
     * @param id 用户ID
     * @return 用户信息
     */
    @RequestLine("GET /{id}")
    User defaultFeignFindById(@Param("id")Long id);
}
