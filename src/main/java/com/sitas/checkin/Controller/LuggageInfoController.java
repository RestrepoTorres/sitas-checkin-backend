package com.sitas.checkin.Controller;

import com.sitas.checkin.Entity.LuggageInfoEntity;
import com.sitas.checkin.Service.LugaggeInfoService;
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
