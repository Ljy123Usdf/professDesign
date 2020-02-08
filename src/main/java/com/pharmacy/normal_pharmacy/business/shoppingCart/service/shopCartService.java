package com.pharmacy.normal_pharmacy.business.shoppingCart.service;

import com.pharmacy.normal_pharmacy.business.common.modal.Eshopcart;
import com.pharmacy.normal_pharmacy.business.shoppingCart.modal.ShopCart;

import java.util.List;

public interface shopCartService {

    public List<ShopCart> selectshopcartBymid(Integer mid);

    public int insertShopcart(Eshopcart eshopcart);

    public int deleteShopcart(Integer sid, Integer cid);

    public int updateShopnumber(Eshopcart eshopcart);
}
