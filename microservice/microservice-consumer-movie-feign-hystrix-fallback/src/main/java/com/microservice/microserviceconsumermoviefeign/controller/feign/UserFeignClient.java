package com.microservice.microserviceconsumermoviefeign.controller.feign;

import com.microservice.microserviceconsumermoviefeign.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
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
@FeignClient(name = "microservice-provider-user", fallback = FeignClientFallback.class)
public interface UserFeignClient {
    /**
     * 获取用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    User findById(@PathVariable("id") Long id);

    /**
     * 使用Feign自带的注解@RequestLine
     *
     * @param id 用户ID
     * @return 用户信息
     * @see https://github.com/OpenFeign/feign
     */
//    @RequestLine("GET /{id}")
//    User defaultFeignFindById(@Param("id") Long id);
}

@Component
class FeignClientFallback implements UserFeignClient {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(-1);
        user.setUsername("默认用户");
        return user;
    }
}