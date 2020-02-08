package com.pharmacy.normal_pharmacy.business.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ereview {
    /*
    评论编号
    */
    int reid;

    /*
    评论对应商品（对应e_commodity 中cid）
    */
    int re_cid;

    /*
    评论商品类型（对应e_commodity 中ctype）
    */
    int re_ctype;

    /*
    品论内容（txt）
    */
    String rebody;

}

