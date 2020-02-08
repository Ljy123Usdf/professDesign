package com.pharmacy.normal_pharmacy.business.informationManagement.service.impl;


import com.pharmacy.normal_pharmacy.business.common.modal.Emember;
import com.pharmacy.normal_pharmacy.business.informationManagement.dao.MemberDao;

import com.pharmacy.normal_pharmacy.business.informationManagement.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao memberDao ;

    @Override
   public List<Emember> MemberAllInformation() {
        List<Emember> memberList = memberDao.MemberAllInformation();
       return  memberList;
   }
}
