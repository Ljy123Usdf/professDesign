package com.pharmacy.normal_pharmacy.business.informationManagement.dao;

import com.pharmacy.normal_pharmacy.business.common.modal.Emember;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MemberDao {

    /*
     * 会员全部信息查询
     * */
    @Select("select * from e_member where mtype='1' ")
    public List<Emember> MemberAllInformation();
}
