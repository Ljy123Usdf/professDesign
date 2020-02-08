package com.pharmacy.normal_pharmacy.business.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eshopcart {

    /**
     * 购物车id
     * */
    int s_id;
    /**
     * 商品id
     * */
    int s_cid;
    /**
     * 加入购物车的商品数量
     * */
    int scount;
    /**
     * 顾客id
     * */
    int s_mid;
}
