package com.pharmacy.normal_pharmacy.business.shoppingCart.controller;

import com.pharmacy.normal_pharmacy.base.result.Result;
import com.pharmacy.normal_pharmacy.business.common.modal.Eshopcart;
import com.pharmacy.normal_pharmacy.business.shoppingCart.service.shopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("ShopCart")
public class shopCartController {

    @Autowired
    private shopCartService shopCartService;

    @CrossOrigin
    @GetMapping("selectshopcartBymid/{mid}")
    public Result result(@PathVariable("mid") Integer mid){
        return Result.result(shopCartService.selectshopcartBymid(mid));
    }

    @PostMapping("insertShopCart")
    public Result insert(@RequestBody Eshopcart eshopcart) {
        return Result.result(shopCartService.insertShopcart(eshopcart),"新增成功","新增失败");
    }

    @DeleteMapping("deleteShopcart")
    public Result result(Integer sid, @RequestParam(defaultValue = "0")Integer cid){
        return Result.result(shopCartService.deleteShopcart(sid,cid),"删除成功","删除失败");
    }

    @PutMapping("updateShopnumber")
    public Result result(@RequestBody Eshopcart eshopcart){
        return Result.result(shopCartService.updateShopnumber(eshopcart),"删除成功","删除失败");
    }
}
