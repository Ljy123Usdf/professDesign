package com.pharmacy.normal_pharmacy.business.shoppingCart.service.imp;

import com.pharmacy.normal_pharmacy.business.common.modal.Eshopcart;
import com.pharmacy.normal_pharmacy.business.shoppingCart.dao.shopDao;
import com.pharmacy.normal_pharmacy.business.shoppingCart.modal.CartShops;
import com.pharmacy.normal_pharmacy.business.shoppingCart.modal.ShopCart;
import com.pharmacy.normal_pharmacy.business.shoppingCart.service.shopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shopCartServiceImp implements shopCartService {
    @Autowired
    private shopDao shopDao;
    //查询购物车
    @Override
    public List<ShopCart> selectshopcartBymid(Integer mid) {
        return shopDao.selectshopcartBymid(mid);
    }

    //增加购物车
    @Override
    public int insertShopcart(Eshopcart eshopcart) {
        Integer shopcount=shopDao.selectshopsBymid(eshopcart.getS_mid(),eshopcart.getS_cid());
        if(shopcount==null||shopcount==0){
            return shopDao.insertShopcart(eshopcart);
        }else{
            CartShops cartShops=new CartShops(eshopcart.getS_mid(),eshopcart.getS_cid(),shopcount+1);
            return shopDao.updatehadchooseshopsBycidmid(cartShops);
      }
    }

    //删除购物车一个商品记录
    @Override
    public int deleteShopcart(Integer sid, Integer cid) {
        return shopDao.deleteshopcartBycid(sid,cid);
    }

    //删除购物车中单个商品数量
    @Override
    public int updateShopnumber(Eshopcart eshopcart) {
        Integer count=shopDao.selectshopsBymid(eshopcart.getS_mid(),eshopcart.getS_cid());
        CartShops cartShops=new CartShops(eshopcart.getS_mid(),eshopcart.getS_cid(),count-1);
        return shopDao.updatehadchooseshopsBycidmid(cartShops);
    }
}
