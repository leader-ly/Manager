package com.Manager.userManager.saaFactor.api;

import com.Manager.userManager.saaFactor.po.SaaFactor;
import com.Manager.userManager.saaFactor.service.SaaFactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/saaFactor")
public class SaaFactorApi {
    @Autowired
    SaaFactorService saaFactorService;

    @GetMapping(value = "/selectAll")
    public List<SaaFactor> selectAll(){
        List<SaaFactor> list = saaFactorService.selectAll();
        return list;
    }

}
