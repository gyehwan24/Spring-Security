package com.security.controller;

import com.security.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test")
public class TestController {

    private final TestService testService;

    //시큐리티에 관계없이 모두 접근 가능
    @GetMapping("/permit-all")
    public Object getTest() throws Exception {
        return testService.getTest();
    }

    //시큐리티 내에서 관리되어야할 URL
    @GetMapping("/auth")
    public Object getTest2() throws Exception {
        return testService.getTest2();
    }
}
