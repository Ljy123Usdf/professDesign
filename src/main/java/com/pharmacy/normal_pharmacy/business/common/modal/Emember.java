package com.pharmacy.normal_pharmacy.business.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emember {
    /*
    会员ID
    */
    int mid;

    /*
    会员昵称
    */
    String mname;

    /*
    注册时间
    */
    String mstarttime;

    /*
    电话号码
    */
    int mtelephone;

    /*
    性别
    */
    String msex;

    /*
    身份证
    */
    String mnumber;

    /*
    身份类别（管理员0/顾客1）
    */
    int mtype;

    /*
    顾客兴趣（推荐）（1,3,4）这种形式
    */
    String minterest;

    /*
   密码
   */
    String mpassword;

}

