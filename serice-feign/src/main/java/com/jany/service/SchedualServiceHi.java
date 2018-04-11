package com.jany.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
//定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了auth服务的“/hi”接口
@FeignClient(value = "auth",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
