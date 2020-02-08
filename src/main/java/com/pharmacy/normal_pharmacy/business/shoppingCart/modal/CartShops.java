package com.pharmacy.normal_pharmacy.business.shoppingCart.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用于增加和修改商品的modal
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartShops {
    /**
     * 用户id
     * */
  private int mId;

    /**
     * 商品id
     * */
   private int cId;

    /**
     * 商品数量
     * */
   private int cOunt;
}
