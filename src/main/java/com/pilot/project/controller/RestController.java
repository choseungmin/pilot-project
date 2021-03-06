package com.pilot.project.controller;

import com.pilot.project.service.RestService;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Slf4j
@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@RequestMapping(value="/api")
public class RestController {

    @Resource(name="com.pilot.project.service.RestServiceImpl")
    private RestService service;

    @PostMapping("/getUserBas")
    public List<Map<String,Object>> getUserBas(@RequestBody Map<String,Object> param) {
        return service.getUserBas();
    }

    @PostMapping("/getOptPeak")
    public List<Map<String,Object>> getOptPeak(@RequestBody Map<String,Object> param) {
        return service.getOptPeak(param);
    }
}
