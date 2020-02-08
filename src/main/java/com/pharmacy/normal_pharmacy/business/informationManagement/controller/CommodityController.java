package com.pharmacy.normal_pharmacy.business.informationManagement.controller;


import com.pharmacy.normal_pharmacy.business.common.modal.Ecommodity;
import com.pharmacy.normal_pharmacy.business.informationManagement.service.CommodityService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping(value="CommodityInfomationManager")
@RestController
public class CommodityController {

    @Autowired
    CommodityService commodityService;

    @GetMapping(value = "CommodityAllInformation")
    public List<Ecommodity> select()
    {
        List<Ecommodity> CommodityList=commodityService.CommodityAllInformation();
        return CommodityList;
    }
}
