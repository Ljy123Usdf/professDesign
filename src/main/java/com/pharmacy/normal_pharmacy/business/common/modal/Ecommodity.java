package com.pharmacy.normal_pharmacy.business.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ecommodity {
    /*
    商品商标
    */
    String clogo;

    /*
    商品编号
    */
    int cid;

    /*
    商品名称
    */
    String cname;

    /*
    商品款型（颜色）
    */
    int cmodel;

    /*
    商品价格
    */
    double cprice;

    /*
    商品保障（售后）（分多种类型）
    */
    int cguarantee;

    /*
    商品类型（手机，图书，生鲜，零食，电子设备）
    */
    int ctype;

    /*
    商品排名（数）（同ctype中根据评论数以及销售量进行排名）
    */
    int cranking;

    /*
    商品重量
    */
    double cweight;

    /*
    商品评价（数）
    */
    int creview;

    /*
    销售量
    */
    int cnumber;

    /**
     * 产地
     * */
    String caddress;
}

