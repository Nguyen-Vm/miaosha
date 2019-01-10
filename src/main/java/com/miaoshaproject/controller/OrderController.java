package com.miaoshaproject.controller;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.response.CommonReturnType;
import com.miaoshaproject.service.OrderService;
import com.miaoshaproject.service.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author RWM
 * @date 2019/1/10
 */
@Controller
@RequestMapping("/order")
public class OrderController extends BaseControler {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "create", method = RequestMethod.GET)
    @ResponseBody
    public CommonReturnType createOrder(@RequestParam(name = "itemId") Integer itemId,
                                        @RequestParam(name = "amount") Integer amount)
            throws BusinessException {
        OrderModel orderModel = orderService.createOrder(1, itemId, amount);
        return CommonReturnType.create(orderModel);
    }
}
