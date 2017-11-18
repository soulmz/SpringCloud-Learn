package com.microservice.microserviceconsumermoviefeign.controller.feign;

import com.microservice.microserviceconsumermoviefeign.domain.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@FeignClient(name = "microservice-provider-user", fallbackFactory = FeignClientFallbackFactory.class)
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
     * @see https://github.com/OpenFeign/feign
     * @param id 用户ID
     * @return 用户信息
     */
//    @RequestLine("GET /{id}")
//    User defaultFeignFindById(@Param("id")Long id);
}

@Component
class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FeignClientFallbackFactory.class);

    @Override
    public UserFeignClient create(Throwable throwable) {
        return id -> {
            // 日志最好放在各个fallback方法中，而不要直接放在create方法中。
            // 否则在引用启动时，就会打印该日志
            FeignClientFallbackFactory.LOGGER.info("fallback; reason was: {}", throwable);
            User user = new User();
            user.setId(-1);
            user.setUsername("默认用户");
            return user;
        };
    }
}