package com.pilot.project.service;

import java.util.ArrayList;
import java.util.Map;

public interface RestService {
    public ArrayList<Map<String,Object>> getUserBas();
    public ArrayList<Map<String,Object>> getOptPeak(Map<String,Object> param);
}
