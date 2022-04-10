package com.ln.blog.server.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lining
 * @date 2022/3/16
 **/
@Service
public class ServiceB {
    @Autowired
    ServiceC serviceC;
}
