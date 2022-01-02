package com.elite.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elite.mybatisplus.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 转账订单表(TOrder)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-01 16:10:59
 */
@Mapper
public interface TOrderDao  extends BaseMapper<TOrder> {

    /**
     * 通过ID查询单条数据
     *
     * @param transferOrderId 主键
     * @return 实例对象
     */
    TOrder queryById(Integer transferOrderId);


    /**
     * 统计总行数
     *
     * @param tOrder 查询条件
     * @return 总行数
     */
    long count(TOrder tOrder);

    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 影响行数
     */
    int insert(TOrder tOrder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TOrder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TOrder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TOrder> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TOrder> entities);

    /**
     * 修改数据
     *
     * @param tOrder 实例对象
     * @return 影响行数
     */
    int update(TOrder tOrder);

    /**
     * 通过主键删除数据
     *
     * @param transferOrderId 主键
     * @return 影响行数
     */
    int deleteById(Integer transferOrderId);

}

