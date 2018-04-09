package com.jany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * ---<br>
 * </p>
 * <p>
 * -----版本-----变更日期-----责任人-----变更内容<br>
 * ─────────────────────────────────────<br>
 * V3.0.0 2018/4/9 liuxiangtao 初版<br>
 *
 * @since XMJR V3.0.0
 * </p>
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://AUTH/hi?name="+name,String.class);
    }
}
