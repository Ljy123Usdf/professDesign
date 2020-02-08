package com.pharmacy.normal_pharmacy.business.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Eranking {
    /*
    排名编号
    */
    int raid;

    /*
    排名对应商品（对应e_commodity 中cid）
    */
    int ra_cid;

    /*
    排名商品类型（对应e_commodity 中ctype）
    */
    int ra_ctype;

    /*
    排名数据（cnumber*0.65+crevirw*0.35）
    */
    double radata;

}

