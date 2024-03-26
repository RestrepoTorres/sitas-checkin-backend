package com.sitas.checkin.services;
import com.sitas.checkin.domain.entity.LuggageInfoEntity;
import com.sitas.checkin.repository.ILuggageInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LugaggeInfoService {
    @Autowired
    private ILuggageInfoRepository repository;

    public LuggageInfoEntity saveLuggageInfo(LuggageInfoEntity lugageInfo){
        return repository.save(lugageInfo);
    }

}
