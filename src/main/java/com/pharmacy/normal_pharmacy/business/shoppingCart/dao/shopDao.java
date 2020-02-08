package com.pharmacy.normal_pharmacy.business.shoppingCart.dao;

import com.pharmacy.normal_pharmacy.business.common.modal.Eshopcart;
import com.pharmacy.normal_pharmacy.business.shoppingCart.modal.CartShops;
import com.pharmacy.normal_pharmacy.business.shoppingCart.modal.ShopCart;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface shopDao{
    //查询用户购物车内商品
    @Select("SELECT s.`s_cid`,s.`scount`,c.`clogo`,c.`cname`,c.`cmodel`,c.`cprice`, c.`cweight`\n" +
            "FROM eshopcart s,ecommodity c WHERE s.`s_cid`=c.cid AND s.`s_mid`=#{mid}")
    List<ShopCart> selectshopcartBymid(@Param("mid") Integer mid);

    //查询同一用户一天假的商品对应的id和数量
    @Select("SELECT scount FROM eshopcart WHERE s_mid=#{mid} and s_cid=#{cid}")
    Integer selectshopsBymid(@Param("mid") Integer mid, @Param("cid") Integer cid);

    //将商品添加至购物车（因同一用户的购物车可以添加多行记录，所以s_id=s_mid即可，这里s_id不自增）
    @Insert("INSERT INTO eshopcart VALUES (#{s_id},#{s_cid},#{scount},#{s_mid})")
    int insertShopcart(Eshopcart eshopcart);

    //同一用户往购物车多次添加同一种商品/减少商品的数量
    @Update("UPDATE eshopcart SET scount=#{cOunt} WHERE s_mid=#{mId} AND s_cid=#{cId}")
    int updatehadchooseshopsBycidmid(CartShops cartShops);

    //删除购物车
    @Delete("<script>" +
            "DELETE FROM eshopcart WHERE\n" +
            "s_id=#{sid} " +
            "<if test=\"cid neq 0\">" +
            "AND s_cid=#{cid} " +
            "</if>" +
            "</script>")
    int deleteshopcartBycid(@Param("sid") Integer sid, @Param("cid") Integer cid);

}
