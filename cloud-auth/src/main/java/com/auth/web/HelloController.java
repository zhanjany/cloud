package com.auth.web;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * ---<br>
 * </p>
 * <p>
 * -----版本-----变更日期-----责任人-----变更内容<br>
 * ─────────────────────────────────────<br>
 * V3.0.0 2018/4/8 liuxiangtao 初版<br>
 *
 * @since XMJR V3.0.0
 * </p>
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        List<ServiceInstance> instances = client.getInstances("auth");
        for (int i = 0; i < instances.size(); i++) {
            logger.info("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
        }
        return "Hello World";
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
