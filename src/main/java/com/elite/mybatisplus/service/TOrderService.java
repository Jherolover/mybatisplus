package com.elite.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.elite.mybatisplus.entity.TOrder;

import java.util.List;


/**
 * 转账订单表(TOrder)表服务接口
 *
 * @author makejava
 * @since 2022-01-01 16:11:05
 */
public interface TOrderService  extends IService<TOrder> {

    /**
     * 通过ID查询单条数据
     *
     * @param transferOrderId 主键
     * @return 实例对象
     */
    TOrder queryById(Integer transferOrderId);



    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    TOrder insert(TOrder tOrder);

    /**
     * 修改数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    TOrder update(TOrder tOrder);

    /**
     * 通过主键删除数据
     *
     * @param transferOrderId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer transferOrderId);

    /**
     * 查询所有的订单数据
     * @return
     */
    List<TOrder> findAll();
}
