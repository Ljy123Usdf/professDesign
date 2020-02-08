package com.pharmacy.normal_pharmacy.business.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eorder {
    /**
     * 订单id
     * */
   int orid  ;
    /**
     * 顾客id
     * */
   int or_mid;
    /**
     * 商品id
     * */
   int or_cid;
   /**
    * 订单创建时间
    * */
   String orjointime;
    /**
     * 订单完成时间
     * */
   String orovertime;
}
