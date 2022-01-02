package com.elite.mybatisplus.controller;

import com.elite.mybatisplus.entity.TOrder;
import com.elite.mybatisplus.service.TOrderService;
import com.elite.mybatisplus.vo.R;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    TOrderService tOrderService;

    @GetMapping("/getOrderById")
    public R getOrderById(){
        List<TOrder> all = (List<TOrder>) tOrderService.queryById(1);
        return R.ok().data("orderList",all);
    }

    @GetMapping("/getOrderlist")
    public R getOrderlist() {
        List<TOrder> list = tOrderService.list();
        return R.ok().data("orderList",list);
    }
}
