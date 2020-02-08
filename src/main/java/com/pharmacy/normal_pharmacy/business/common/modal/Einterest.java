package com.pharmacy.normal_pharmacy.business.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Einterest {
    /*
    兴趣编号
    */
    int iid;

    /*
    兴趣对应顾客（对应e_commodity 中cid）
    */
    int i_cid;

    /*
    0类型商品的浏览次数
    */
    int i_ctype_0;

    /*
   1类型商品的浏览次数
   */
    int i_ctype_1;

    /*
    2类型商品的浏览次数
    */
    int i_ctype_2;

    /*
    3类型商品的浏览次数
    */
    int i_ctype_3;

    /*
    4类型商品的浏览次数
    */
    int i_ctype_4;

}

