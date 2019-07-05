package com.pilot.project.controller;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Slf4j
@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@RequestMapping(value="/api")
public class RestController {

    @PostMapping("/selectUserBas")
    public List<Map<String,Object>> selectUserBas(@RequestBody Map<String,Object> req) {
        return null;
    }

    @PostMapping("/test")
    public String test(@RequestBody Map<String,Object> req) {
        log.info(">>>>>>>>>>");
        String reqString = req.get("param").toString();
        return "Test Success, param Text is " + reqString;
    }
}
