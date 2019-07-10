package com.pilot.project.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.Map;

@Mapper
public interface RestMapper {
    public ArrayList<Map<String,Object>> getUserBas();
    public ArrayList<Map<String,Object>> getOptPeak(Map<String,Object> param);
}
