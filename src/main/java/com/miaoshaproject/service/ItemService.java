package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

/**
 * @author RWM
 * @date 2019/1/10
 */
public interface ItemService {

    // 商品详情浏览
    ItemModel getItemById(Integer id);

    // 库存扣减
    boolean decreaseStock(Integer itemId, Integer amount) throws BusinessException;

    // 商品销量增加
    void increaseSales(Integer itemId, Integer amount) throws BusinessException;
}
