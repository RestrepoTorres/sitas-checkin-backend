package com.sitas.checkin.Service;
import com.sitas.checkin.Entity.LuggageInfoEntity;
import com.sitas.checkin.Repository.ILuggageInfoRepository;
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
