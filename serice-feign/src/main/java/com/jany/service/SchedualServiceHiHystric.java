package com.jany.service;

import org.springframework.stereotype.Component;

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
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
