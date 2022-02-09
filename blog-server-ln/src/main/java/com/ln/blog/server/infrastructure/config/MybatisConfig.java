package com.ln.blog.server.infrastructure.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lining
 * @date 2022/2/9
 **/
@Configuration
@MapperScan(value = "com.ln.blog.server.infrastructure.repository.**.mapper")
public class MybatisConfig {
}
