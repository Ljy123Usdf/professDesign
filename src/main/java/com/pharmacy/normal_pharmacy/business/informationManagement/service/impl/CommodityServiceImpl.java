package com.pharmacy.normal_pharmacy.business.informationManagement.service.impl;


import com.pharmacy.normal_pharmacy.business.common.modal.Ecommodity;
import com.pharmacy.normal_pharmacy.business.informationManagement.dao.CommodityDao;
import com.pharmacy.normal_pharmacy.business.informationManagement.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    CommodityDao textModelqDao ;

    @Override
   public  List<Ecommodity> CommodityAllInformation() {
        List<Ecommodity> eCommodityList = textModelqDao.selectAll();
       return  eCommodityList;
   }
}
