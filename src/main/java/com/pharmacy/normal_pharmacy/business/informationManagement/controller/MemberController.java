package com.pharmacy.normal_pharmacy.business.informationManagement.controller;


import com.pharmacy.normal_pharmacy.business.common.modal.Emember;
import com.pharmacy.normal_pharmacy.business.informationManagement.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping(value="MemberInfomationManager")
@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping(value = "MemberAllInformation")
    public List<Emember> select()
    {
        List<Emember> memberList=memberService.MemberAllInformation();
        return memberList;
    }

}
