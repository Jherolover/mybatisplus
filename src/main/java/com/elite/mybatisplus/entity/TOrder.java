package com.elite.mybatisplus.entity;

import java.io.Serializable;

/**
 * 转账订单表(TOrder)实体类
 *
 * @author makejava
 * @since 2022-01-01 16:11:03
 */
public class TOrder implements Serializable {
    private static final long serialVersionUID = -30543038910557833L;
    /**
     * 转账订单id
     */
    private Integer transferOrderId;
    /**
     * 转账金额
     */
    private Double price;
    /**
     * 状态，1：转账成功，2：转账失败
     */
    private Integer status;
    /**
     * 版本号，每次更新+1
     */
    private Integer version;


    public Integer getTransferOrderId() {
        return transferOrderId;
    }

    public void setTransferOrderId(Integer transferOrderId) {
        this.transferOrderId = transferOrderId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}

