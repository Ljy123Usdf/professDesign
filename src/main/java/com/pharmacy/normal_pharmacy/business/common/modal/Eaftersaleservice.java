package com.pharmacy.normal_pharmacy.business.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Eaftersaleservice {
    /*
    售后类型ID
    */
    int aid;

    /*
    售后服务对应商品类型
    */
    int a_ctype;

    /*
    该商品类型对应售后服务名称
    */
    String atype;

    /*
    该售后服务对应服务编号对应e_commodity中cguarantee
    */
    int a_cguarantee;

    /*
    售后服务内容
    */
    String abody;

}

