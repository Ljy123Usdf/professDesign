package com.pharmacy.normal_pharmacy.business.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Eaftersaleserviceinfo {
    /*
    售后记录ID
    */
    int ainfoid;

    /*
    售后记录对应售后服务类型
    */
    int ainfo_aid;

    /*
    售后记录对应会员ID
    */
    int ainfo_cid;

    /*
    售后服务时间
    */
    String ainfodata;

    /*
    售后服务对应操作的管理人员
    */
    int ainfo_cid_manager;

}

