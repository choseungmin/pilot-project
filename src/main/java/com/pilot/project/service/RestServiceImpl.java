package com.pilot.project.service;

import com.pilot.project.mapper.RestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service("com.pilot.project.service.RestServiceImpl")
public class RestServiceImpl implements RestService {

    @Autowired
    RestMapper mapper;

    @Override
    public ArrayList<Map<String, Object>> getUserBas() {
        return mapper.getUserBas();
    }

    @Override
    public ArrayList<Map<String, Object>> getOptPeak(Map<String,Object> param) {
        return mapper.getOptPeak(param);
    }
}
