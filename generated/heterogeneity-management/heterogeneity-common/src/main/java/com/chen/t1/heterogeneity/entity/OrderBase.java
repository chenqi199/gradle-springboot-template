package  com.chen.t1.heterogeneity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单基础信息
 * </p>
 *
 * @author chen_q_i@163.com
 * @since 2022-02-11
 */
@TableName("order_base")
public class OrderBase implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 单号
     */
    private String orderSn;

    /**
     * 商品id
     */
    private Long goodsId;

    /**
     * 客户id
     */
    private Long customerId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 付款单Id
     */
    private Long payOrderId;

    /**
     * 下单时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(Long payOrderId) {
        this.payOrderId = payOrderId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "OrderBase{" +
        "id=" + id +
        ", orderSn=" + orderSn +
        ", goodsId=" + goodsId +
        ", customerId=" + customerId +
        ", shopId=" + shopId +
        ", amount=" + amount +
        ", payOrderId=" + payOrderId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
