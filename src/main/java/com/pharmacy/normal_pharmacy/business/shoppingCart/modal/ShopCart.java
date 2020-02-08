package com.pharmacy.normal_pharmacy.business.shoppingCart.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopCart {

   Integer sCid;
   Integer sCount;
   String cCame;
   String cModel;
   Double cPrice;
   Double cWeight;
}
