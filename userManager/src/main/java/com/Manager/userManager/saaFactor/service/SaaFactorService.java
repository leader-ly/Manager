package com.Manager.userManager.saaFactor.service;

import com.Manager.userManager.saaFactor.dao.SaaFactorMapper;
import com.Manager.userManager.saaFactor.po.SaaFactor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SaaFactorService {
    @Autowired
    SaaFactorMapper saaFactorMapper;

    public List<SaaFactor> selectAll(){
        List<SaaFactor> list = saaFactorMapper.selectAll();
        return list;
    }
}
