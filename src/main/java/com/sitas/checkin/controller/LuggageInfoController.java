package com.sitas.checkin.controller;

import com.sitas.checkin.domain.entity.LuggageInfoEntity;
import com.sitas.checkin.services.LugaggeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LuggageInfoController {
    @Autowired
    private LugaggeInfoService service;
    @PostMapping("/addLuggageInfo")
    public LuggageInfoEntity addLuggageInfo(@RequestBody LuggageInfoEntity luggageInfo){
        return service.saveLuggageInfo(luggageInfo);
    }
}
