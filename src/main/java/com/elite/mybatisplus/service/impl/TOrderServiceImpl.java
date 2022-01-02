package com.elite.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elite.mybatisplus.entity.TOrder;
import com.elite.mybatisplus.dao.TOrderDao;
import com.elite.mybatisplus.service.TOrderService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import java.util.List;


/**
 * 转账订单表(TOrder)表服务实现类
 *
 * @author makejava
 * @since 2022-01-01 16:11:06
 */
@Service("tOrderService")
public class TOrderServiceImpl extends ServiceImpl<TOrderDao,TOrder> implements TOrderService {
    @Resource
    private TOrderDao tOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param transferOrderId 主键
     * @return 实例对象
     */
    @Override
    public TOrder queryById(Integer transferOrderId) {
        return this.tOrderDao.queryById(transferOrderId);
    }



    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder insert(TOrder tOrder) {
        this.tOrderDao.insert(tOrder);
        return tOrder;
    }

    /**
     * 修改数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder update(TOrder tOrder) {
        this.tOrderDao.update(tOrder);
        return this.queryById(tOrder.getTransferOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param transferOrderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer transferOrderId) {
        return this.tOrderDao.deleteById(transferOrderId) > 0;
    }

    /**
     *
     * @return
     */
    @Override
    public List<TOrder> findAll() {
        QueryWrapper<TOrder> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("transfer_order_id",1);
        return this.tOrderDao.selectList(queryWrapper);
    }


}
