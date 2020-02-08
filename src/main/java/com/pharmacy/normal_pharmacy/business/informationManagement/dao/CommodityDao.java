package com.pharmacy.normal_pharmacy.business.informationManagement.dao;

import com.pharmacy.normal_pharmacy.business.common.dao.BaseMapper;

import com.pharmacy.normal_pharmacy.business.common.modal.Ecommodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CommodityDao extends BaseMapper<Ecommodity> {

    /*
    * 商品全部信息查询
    * */
//    @Select("select * from e_commodity ")
//    public List<Ecommodity> CommodityAllInformation();

}
